package io.github.xingkongqwq.dub.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.ArrayList;

@Data
@TableName("studio")
public class Studio {
    @TableId
    private Integer id;
    private User leader;
    private ArrayList<User> administrator;
    private ArrayList<User> member;
}
