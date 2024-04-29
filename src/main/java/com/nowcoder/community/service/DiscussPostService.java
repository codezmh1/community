package com.nowcoder.community.service;

import com.nowcoder.community.dao.DiscussPostMapper;
import com.nowcoder.community.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussPostService {

    @Autowired
    private DiscussPostMapper discussPostMapper;

    public List<DiscussPost> findDiscussPosts(int userId, int offset, int limit) {
        return discussPostMapper.selectDiscussPosts(userId, offset, limit);
    }

    public int findDiscussPostRows(int userId) {
        return discussPostMapper.selectDiscussPostRows(userId);
    }

    // 一个问题：查询到的userId外键，但实际需要用户名一类的东西。可以查询时关联user表，也可以得到此数据后单独针对每个DiscussPost查一下user组合后返回
    // 后者的话，将来使用Redis时性能会更高。需要再提供一个业务方法，因此再写一个UserService
}
