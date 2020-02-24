package com.websocket.demo.dto;

import com.websocket.demo.dto.enums.MessageType;
import lombok.Data;

@Data
public class ChatMessage {
  private MessageType type;
  private String content;
  private String sender;

}
