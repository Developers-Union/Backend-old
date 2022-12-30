package io.github.xingkongqwq.dub.pojo;

import lombok.Data;

@Data
public class User {
    private String username;
    private String password;
    private String email;
    private Integer id;
    private Integer followers;
    private Integer followings;
}
