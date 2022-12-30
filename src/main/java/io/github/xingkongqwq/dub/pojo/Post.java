package io.github.xingkongqwq.dub.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Post {
    private Integer id;
    private Date publishDate;
    private User author;
    private Integer readings;
    private Integer likes;
    private Integer collections;
}
