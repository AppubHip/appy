package com.example.appy.vo;

import lombok.Data;

@Data
public class messageVO {
    private String userID;
    private String appyID;
    private String userMessage;
    private String assistantMessage;
    private String timestamp;
}
