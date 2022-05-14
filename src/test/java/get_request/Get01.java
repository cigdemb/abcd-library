package get_request;

import base_urls.LibraryBaseUrl;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;

public class Get01 extends LibraryBaseUrl {
/*
        Given
           URL: http://localhost:8080/api/book
                When
                    User send GET Request to the URL
                Then
                     Status code is 200
                And
                    There are 2 books
                And
                   "White Flow" is among the books
                And
                    The greatest page number is 80
                    And
                     The author name of the 80 pages book is "[Abraham]"
                And
                     The language of the books are "eng"

 */

    @Test
    public void get01() {
        spec.pathParam("first", "book");
        Response response = given().spec(spec).when().get("/{first}");
        response.then().statusCode(200)
                .body("data.id", hasSize(2))
                .body("data.bookName", hasItem("White Flow"));
        JsonPath json = response.jsonPath();
        List<Integer> pageList = json.getList("data.findAll{it.id==0}.pageNumber");
        Collections.sort(pageList);
        assertEquals(80, (int)pageList.get(pageList.size() - 1));
        String groovyString = "data.findAll{it.pageNumber==" + pageList.get(pageList.size()-1)+ "}.authorName";
        assertEquals("[Abraham]", json.getString(groovyString));
        List<String> langList = json.getList("data.findAll{it.id==0}.language");
        int counter = 0;
        for (String w: langList) {
            w.equals("eng");
            counter++;
        }
        assertEquals(pageList.size(), counter);
    }
}
