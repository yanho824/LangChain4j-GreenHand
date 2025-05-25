package com.syh.javaailangchain4j.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

public class ChatMessages {
    @Id
    private ObjectId messageId;
    private String memoryId;
    private String content;

    public ChatMessages() {
    }

    public ChatMessages(ObjectId messageId, String memoryId, String content) {
        this.messageId = messageId;
        this.memoryId = memoryId;
        this.content = content;
    }

    @Override
    public String toString() {
        return "ChatMessages{" +
                "messageId=" + messageId +
                ", memoryId='" + memoryId + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ChatMessages that = (ChatMessages) o;
        return Objects.equals(messageId, that.messageId) && Objects.equals(memoryId, that.memoryId) && Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, memoryId, content);
    }

    public ObjectId getMessageId() {
        return messageId;
    }

    public void setMessageId(ObjectId messageId) {
        this.messageId = messageId;
    }

    public String getMemoryId() {
        return memoryId;
    }

    public void setMemoryId(String memoryId) {
        this.memoryId = memoryId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
