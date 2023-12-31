package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author 张尔睿
 * @version 1.0
 */
@Mapper
public interface UserMapper {

    /**
     * 根据openid查询微信用户
     * @param openid
     * @return
     */
    @Select("select * from user where openid =#{openid}")
    User getByOpenid(String openid);

    /**
     * 插入数据
     * @param user
     */
    void insert(User user);
}
