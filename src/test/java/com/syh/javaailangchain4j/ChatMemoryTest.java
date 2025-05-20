package com.syh.javaailangchain4j;

import com.syh.javaailangchain4j.assistant.Assistant;
import com.syh.javaailangchain4j.assistant.ChatMemoryAssistant;
import com.syh.javaailangchain4j.assistant.SeparateChatAssistant;
import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.response.ChatResponse;
import dev.langchain4j.service.AiServices;
import dev.langchain4j.service.spring.AiService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
public class ChatMemoryTest {
    @Autowired
    private QwenChatModel qwenChatModel;

    @Test
    public void testChatMemory1(){
        Assistant assistant = AiServices.create(Assistant.class, qwenChatModel);
        String answer1 = assistant.chat("my name is syh");
        System.out.println(answer1);

        String answer2 = assistant.chat("what is my name?");
        System.out.println(answer2);
    }

    @Test
    public void testChatMemory2(){
        UserMessage message1 = UserMessage.userMessage("my name is syh");
        ChatResponse response1 = qwenChatModel.chat(message1);
        AiMessage aiMessage1 = response1.aiMessage();
        System.out.println(aiMessage1.text());

        UserMessage message2 = UserMessage.userMessage("what is my name?");
        ChatResponse response2 = qwenChatModel.chat(Arrays.asList(message1, aiMessage1, message2));
        AiMessage aiMessage2 = response2.aiMessage();
        System.out.println(aiMessage2.text());
    }

    @Test
    void testChatMemory3() {
        MessageWindowChatMemory chatMemory = MessageWindowChatMemory.withMaxMessages(10);

        Assistant assistant = AiServices.builder(Assistant.class)
                .chatLanguageModel(qwenChatModel)
                .chatMemory(chatMemory)
                .build();

        String answer1 = assistant.chat("我叫syh");
        System.out.println(answer1);
        String answer2 = assistant.chat("我叫什么名字？");
        System.out.println(answer2);

    }

    @Autowired
    private ChatMemoryAssistant chatMemoryAssistant;
    @Test
    void testChatMemory4() {
        String answer1 = chatMemoryAssistant.chat("我叫syh，我今年21岁");
        System.out.println(answer1);
        String answer2 = chatMemoryAssistant.chat("我叫什么名字？");
        System.out.println(answer2);
        String answer3 = chatMemoryAssistant.chat("我今年几岁？");
        System.out.println(answer3);
    }

    @Autowired
    private SeparateChatAssistant separateChatAssistant;
    @Test
    void testChatMemory5() {
        String answer1 = separateChatAssistant.chat(1,"我叫syh，我今年21岁");
        System.out.println(answer1);
        String answer2 = separateChatAssistant.chat(1,"我叫什么名字？");
        System.out.println(answer2);
        String answer3 = separateChatAssistant.chat(2,"我叫什么名字？");
        System.out.println(answer3);
    }
}
