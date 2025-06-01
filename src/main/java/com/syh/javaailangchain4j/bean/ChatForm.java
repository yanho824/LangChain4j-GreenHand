package com.syh.javaailangchain4j.bean;

import java.util.Objects;

public class ChatForm {
    private Long memoryId;//对话id
    private String message;//用户问题

    public ChatForm(Long memoryId, String message) {
        this.memoryId = memoryId;
        this.message = message;
    }

    public ChatForm() {
    }

    @Override
    public String toString() {
        return "ChatForm{" +
                "memoryId=" + memoryId +
                ", message='" + message + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ChatForm chatForm = (ChatForm) o;
        return Objects.equals(memoryId, chatForm.memoryId) && Objects.equals(message, chatForm.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memoryId, message);
    }

    public Long getMemoryId() {
        return memoryId;
    }

    public void setMemoryId(Long memoryId) {
        this.memoryId = memoryId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
