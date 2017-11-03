package org.yakimovdenis.demoyakimovwebrtc.models;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class User {
    private Integer id;
    private String name;
    private String email;
    private String password;
    private UserGroup group;
    private Date created;
    private Date born;
    private Date lastAccess;
    private boolean enabled;
    private List<User> friends;
    private List<User> blocked;
}
