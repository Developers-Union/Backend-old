package io.github.xingkongqwq.dub.service.impl;

import io.github.xingkongqwq.dub.pojo.User;
import io.github.xingkongqwq.dub.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User login(String username, String password) {
        return null;
    }

    @Override
    public User register(String username, String email, String password, int age) {
        return null;
    }

    @Override
    public User getById(int id) {
        if (id < 200) {
            return new User();
        }
        return null;
    }
}
