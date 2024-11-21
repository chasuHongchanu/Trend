package com.example.trend.chat.dto;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessageDto {
    private int messageId;
    private int roomId;
    private String senderId;
    private String messageContent;
    private String messageImg;
    private Timestamp chatCreatedAt;
}
