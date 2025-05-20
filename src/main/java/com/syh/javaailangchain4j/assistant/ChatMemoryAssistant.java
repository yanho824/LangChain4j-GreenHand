package com.syh.javaailangchain4j.assistant;

import dev.langchain4j.service.spring.AiService;
import dev.langchain4j.service.spring.AiServiceWiringMode;

@AiService(wiringMode = AiServiceWiringMode.EXPLICIT, chatModel = "qwenChatModel", chatMemory = "chatMemory")
public interface ChatMemoryAssistant {
    String chat(String userMessage);
}
