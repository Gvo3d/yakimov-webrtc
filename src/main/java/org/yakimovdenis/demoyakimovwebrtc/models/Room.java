package org.yakimovdenis.demoyakimovwebrtc.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class Room {
    private long id;
    private String name;
    private Date created;
    private User author;
    private List<User> users;
    private boolean opened;
    private List<ChatMessage> messages;
}
