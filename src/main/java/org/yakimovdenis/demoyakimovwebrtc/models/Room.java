package org.yakimovdenis.demoyakimovwebrtc.models;

import lombok.Data;

import java.util.Date;

public class Room {
    private long id;
    private String name;
    private Date created;
    private boolean opened;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public boolean isOpened() {
        return opened;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
    }
}
