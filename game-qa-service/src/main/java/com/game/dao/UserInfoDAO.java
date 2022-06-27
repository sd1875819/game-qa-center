package com.game.dao;


import com.game.mapper.UserInfoMapper;
import com.game.pojo.UserInfoDO;
import com.game.pojo.UserInfoVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 11123357
 * @Date 2020/8/19 10:21
 * @Version 1.0
 */
@Component
@Slf4j
public class UserInfoDAO {

    @Resource
    public UserInfoMapper userInfoMapper;
    /**
     * @desc 将用户数据插入数据库
     * @return
     */
    public int insertUserInfoDAO(UserInfoVO userInfoVO) {
        return userInfoMapper.insertUserInfoMapper(userInfoVO);
    }


    public List<UserInfoDO> getUserInfoDAO() {
        return userInfoMapper.getUserInfoListMapper();
    }
}
