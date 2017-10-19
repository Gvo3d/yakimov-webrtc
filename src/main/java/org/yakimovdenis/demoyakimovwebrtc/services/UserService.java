package org.yakimovdenis.demoyakimovwebrtc.services;

import org.springframework.stereotype.Service;
import org.yakimovdenis.demoyakimovwebrtc.models.User;

@Service
public class UserService {
    ThreadLocal<User> user = new ThreadLocal<>();

    public void setUser(User user) {
        this.user.set(user);
    }

    public User getUser(){
        return this.user.get();
    }
}
