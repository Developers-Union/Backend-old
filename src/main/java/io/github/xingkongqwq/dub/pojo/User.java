package io.github.xingkongqwq.dub.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {
    @TableId
    private Integer id;
    private String username;
    private String password;
    private String email;
    private Integer followers;
    private Integer followings;
}
