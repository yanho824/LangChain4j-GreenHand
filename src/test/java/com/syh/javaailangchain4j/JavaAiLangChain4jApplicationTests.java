package com.syh.javaailangchain4j;

import dev.langchain4j.model.openai.OpenAiChatModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaAiLangChain4jApplicationTests {

    @Test
    void LLMTest() {
        OpenAiChatModel model = OpenAiChatModel.builder()
                .baseUrl("http://langchain4j.dev/demo/openai/v1")
                .apiKey("demo")
                .modelName("gpt-4o-mini")
                .build();

        String answer = model.chat("long time no see, how are you?");
        System.out.println(answer); // Hello World
    }

    @Autowired
    private OpenAiChatModel openAiChatModel;
    @Test
    void testSpringboot() {
        String answer = openAiChatModel.chat("who are you?");
        System.out.println(answer); // I am a large language model trained by OpenAI.

    }


}
