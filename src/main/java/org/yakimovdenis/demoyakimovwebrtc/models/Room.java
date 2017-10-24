package org.yakimovdenis.demoyakimovwebrtc.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Room {
    private long id;
    private String name;
    private Date created;
    private Long authorId;
    private List<User> users = new ArrayList<>();
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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void addUserToRoom(User user) {
        this.users.add(user);
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }
}
