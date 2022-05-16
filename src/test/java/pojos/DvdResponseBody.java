package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;


import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class DvdResponseBody {

    private List<DvdDataPojo> data = null;
    private String msgId;
    private String text;
    private String type;

   public DvdResponseBody() {
    }

   public DvdResponseBody(List<DvdDataPojo> data, String msgId, String text, String type) {
        super();
        this.data = data;
        this.msgId = msgId;
        this.text = text;
        this.type = type;
    }

    public List<DvdDataPojo> getData() {
        return data;
    }

    public void setData(List<DvdDataPojo> data) {
        this.data = data;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "DvdResponseBody{" +
                "data=" + data +
                ", msgId='" + msgId + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
