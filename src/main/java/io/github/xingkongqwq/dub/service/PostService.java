package io.github.xingkongqwq.dub.service;


import io.github.xingkongqwq.dub.pojo.Post;

import java.util.List;

/**
 * @author mdr
 */
public interface PostService {
    Post getById(int id);

    Post upload(int author);

    List<Post> getByAuthor(int author);
}
