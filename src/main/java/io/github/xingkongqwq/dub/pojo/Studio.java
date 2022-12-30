package io.github.xingkongqwq.dub.pojo;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Studio {
    private Integer id;
    private User leader;
    private ArrayList<User> administrator;
    private ArrayList<User> member;
}
