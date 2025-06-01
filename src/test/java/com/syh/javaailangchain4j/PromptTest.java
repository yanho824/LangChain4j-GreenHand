package com.syh.javaailangchain4j;

import com.syh.javaailangchain4j.assistant.SeparateChatAssistant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PromptTest {
    @Autowired
    private SeparateChatAssistant separateChatAssistant;

    @Test
    public void testSystemMessage1() {
        String answer = separateChatAssistant.chat(3,"今天几号");
        System.out.println(answer);
    }
    @Test
    public void testSystemMessage2() {
        String answer = separateChatAssistant.chat(4,"今天几号");
        System.out.println(answer);
    }

    @Test
    public void testSystemMessage3() {
        String answer1 = separateChatAssistant.chat2(5,"我叫小帅，你是谁？");
        System.out.println(answer1);
        String answer2 = separateChatAssistant.chat2(5,"今天几号？？");
        System.out.println(answer2);
    }

}
