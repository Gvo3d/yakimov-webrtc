package org.yakimovdenis.demoyakimovwebrtc.models;

import lombok.Data;

import java.util.Date;

@Data
public class ChatMessage {
    private Long id;
    private String message;
    private User author;
    private Date send;
    private User receiver;
    private Room room;
}
