package io.github.xingkongqwq.dub.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.xingkongqwq.dub.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
