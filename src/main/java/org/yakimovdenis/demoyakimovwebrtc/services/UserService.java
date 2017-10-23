package org.yakimovdenis.demoyakimovwebrtc.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.yakimovdenis.demoyakimovwebrtc.models.User;

import java.util.HashMap;
import java.util.Map;

@Service
//@Scope(value = "session")
public class UserService {
    private ThreadLocal<User> user = new ThreadLocal<>();
    private Long userIdGenerator = 0L;
    Map<Long, User> users = new HashMap<>();

    public User setUser(User user) {
        user.setId(userIdGenerator++);
        this.user.set(user);
        users.put(user.getId(), user);
        System.out.println(user);
        return this.user.get();
    }

    public User getUser() {
        return this.user.get();
    }

    public User getUser(Long id) {
        return this.user.get();
    }
}
