package com.syh.javaailangchain4j.assistant;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;
import reactor.core.publisher.Flux;

import static dev.langchain4j.service.spring.AiServiceWiringMode.EXPLICIT;

@AiService(
        wiringMode = EXPLICIT,
//        chatModel = "qwenChatModel",
        streamingChatModel = "qwenStreamingChatModel", //使用流式模型
        chatMemoryProvider = "chatMemoryProviderXiaozhi",
        tools = "appointmentTools",
        contentRetriever = "contentRetrieverXiaozhiPinecone"    //配置向量存储
    )
public interface XiaozhiAgent {
    /**
     * 与小智进行对话
     *
     * @param userMessage 用户消息
     * @return 小智的回复
     */
    @SystemMessage(fromResource = "xiaozhi-agent-prompt.txt")
    Flux<String> chat(@MemoryId Long memoryId, @UserMessage String userMessage);
}
