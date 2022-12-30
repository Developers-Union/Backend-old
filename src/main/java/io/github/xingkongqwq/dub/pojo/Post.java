package io.github.xingkongqwq.dub.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("post")
public class Post {
    @TableId
    private Integer id;
    private Date publishDate;
    private User author;
    private Integer readings;
    private Integer likes;
    private Integer collections;
}
