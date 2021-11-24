package com.abcdLibrary.backend.abcdLibrary.handling;


import lombok.Data;

@Data
public class RestResponse<T> {

    private T      data;
    private String msgId;
    private String text;
    private String type;
}
