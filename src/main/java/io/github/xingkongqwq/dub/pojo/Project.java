package io.github.xingkongqwq.dub.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.ArrayList;

@Data
@TableName("project")
public class Project {
    @TableId
    private Integer id;
    private ArrayList<User> developers;
    private String mainLanguage;
}
