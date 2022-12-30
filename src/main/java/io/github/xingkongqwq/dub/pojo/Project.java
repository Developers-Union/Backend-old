package io.github.xingkongqwq.dub.pojo;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Project {
    private Integer id;
    private ArrayList<User> developers;
    private String mainLanguage;
}
