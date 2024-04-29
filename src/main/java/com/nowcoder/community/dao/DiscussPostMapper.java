package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit); //考虑分页

    int selectDiscussPostRows(@Param("userId") int userId); // 查询帖子行数 Param用于给参数取别名。如果方法只有一个参数，且在<if>里使用，则必须加别名。

}
