package org.yakimovdenis.demoyakimovwebrtc.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import org.yakimovdenis.demoyakimovwebrtc.models.User;

import java.util.List;

@Repository
public class ChatMessageRepository implements PersistentRepository<User, Integer>{

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<User> getAll() {
        return mongoTemplate.findAll(User.class);
    }

    @Override
    public User getOne(Integer integer) {
        return null;
    }

    @Override
    public boolean exists(Integer integer) {
        return false;
    }

    @Override
    public Long count() {
        return null;
    }

    @Override
    public boolean delete(Integer integer) {
        return false;
    }

    @Override
    public Integer persist(User user) {
        return null;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public Page<User> getPage(PageRequest request) {
        return null;
    }
}
