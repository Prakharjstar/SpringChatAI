package com.gpt5.gpt5.Service;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.stereotype.Service;

@Service
public class OllamaService {

    private final ChatModel chatModel;

    public OllamaService(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    public String Response(String prompt) {
        try {
          
            return chatModel.call(prompt);
        } catch (Exception e) {
            e.printStackTrace(); 
            return "Error: " + e.getMessage();
        }
    }
}
