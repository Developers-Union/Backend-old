package io.github.xingkongqwq.dub.service;


import io.github.xingkongqwq.dub.pojo.User;

public interface UserService {
    User login(String username, String password);

    User register(String username, String email, String password, int age);

    User getById(int id);
}
