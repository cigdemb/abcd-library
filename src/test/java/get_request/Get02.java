package get_request;

import base_urls.LibraryBaseUrl;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.DvdDataPojo;
import pojos.DvdResponseBody;
import utils.JsonUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

public class Get02 extends LibraryBaseUrl {
    /*
        Given
           URL: http://localhost:8080/api/dvd
                When
                    User send GET Request to the URL
                Then
                     Status code is 200
                And
                    Response content type is "application/json"
                And
                    Response body should be like;
"data": [
        {
            "id": 0,
            "uuid": 0,
            "dvdName": "Black",
            "directorSurname": "Brown",
            "directorName": "Boni",
            "year": "1999",
            "duration": "1:55",
            "genres": "Horror",
            "language": "Eng"
        },
        {
            "id": 0,
            "uuid": 0,
            "dvdName": "Truman Show",
            "directorSurname": "Tony",
            "directorName": "Jace",
            "year": "1999",
            "duration": "2:30",
            "genres": "Comedi",
            "language": "Eng"
        }
    ],
    "msgId": "dvdsFetched",
    "text": "dvdsFetched",
    "type": "SUCCESS"

 */
    @Test
    public void get01() {
        spec.pathParam("first", "dvd");
        //Integer id, Integer uuid, String dvdName, String directorSurname, String directorName, String year, String duration, String genres, String language
        DvdDataPojo actualData1 = new DvdDataPojo(0, 0, "Black", "Brown", "Boni", "1999", "1:55", "Horror", "Eng");
        DvdDataPojo actualData2 = new DvdDataPojo(0, 0, "Truman Show", "Tony", "Jace", "1999", "2:30", "Comedi", "Eng");
        List<DvdDataPojo> list = new ArrayList<>();
        list.add(actualData1);
        list.add(actualData2);
        DvdResponseBody expectedResponseBody = new DvdResponseBody(list, "dvdsFetched", "dvdsFetched", "SUCCESS");
        Response response = given().spec(spec).when().get("/{first}");
        //response.prettyPrint();
        response.then().assertThat().statusCode(200);
        DvdResponseBody responseBodyPojo = JsonUtil.convertJsonToJavaObject(response.asString(), DvdResponseBody.class);

        assertEquals(expectedResponseBody.getData().get(1).getDvdName(), responseBodyPojo.getData().get(1).getDvdName());
        assertEquals(expectedResponseBody.getData().get(0).getDvdName(),responseBodyPojo.getData().get(0).getDvdName());
        assertEquals(expectedResponseBody.getData().size(), responseBodyPojo.getData().size());
        assertEquals(expectedResponseBody.getMsgId(), responseBodyPojo.getMsgId());
        assertEquals(expectedResponseBody.getText(),responseBodyPojo.getMsgId());
        assertEquals(expectedResponseBody.getText(),responseBodyPojo.getText());


      }
}
