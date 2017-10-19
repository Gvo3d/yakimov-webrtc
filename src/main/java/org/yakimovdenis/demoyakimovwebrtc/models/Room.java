package org.yakimovdenis.demoyakimovwebrtc.models;

import lombok.Data;

import java.util.Date;

@Data
public class Room {
    private long id;
    private String name;
    private Date created;
    private boolean opened;
}
