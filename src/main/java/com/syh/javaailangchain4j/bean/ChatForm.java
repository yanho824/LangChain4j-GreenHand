package com.syh.javaailangchain4j.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatForm {
    private Long memoryId;//对话id
    private String message;//用户问题
}
