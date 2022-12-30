package io.github.xingkongqwq.dub.service.impl;

import io.github.xingkongqwq.dub.pojo.Post;
import io.github.xingkongqwq.dub.service.PostService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Override
    public Post getById(int id) {
        return null;
    }

    @Override
    public Post upload(int author) {
        return null;
    }

    @Override
    public List<Post> getByAuthor(int author) {
        return null;
    }
}
