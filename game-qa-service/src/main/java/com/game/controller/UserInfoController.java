package com.game.controller;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.game.dao.UserInfoDAO;
import com.game.mapper.UserInfoMapper;
import com.game.pojo.UserInfoDO;
import com.game.pojo.UserInfoVO;
import com.game.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.xml.transform.Result;
import java.util.List;

import static org.apache.logging.log4j.message.MapMessage.MapFormat.JSON;


/**
 * @Author 11123357
 * @Date 2020/8/19 10:19
 * @Version 1.0
 */
@RestController
@Slf4j
@CrossOrigin
@Component
@RequestMapping("/user")   //统一的路由

public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;

    @Resource
    UserInfoDAO userInfoDAO;
    UserInfoMapper userInfoMapper;

    /*将用户信息存入数据库*/
    @PostMapping(value = "/userInfo/submit")
    public int submitUserInfo(@RequestBody UserInfoVO userInfoVO) {  //@RequestBody就是把前端传过来的json对象映射为java实体UserInfoVO

        int insertResultCode = userInfoService.insertUserInfoService(userInfoVO);

        return insertResultCode;
    }
/*
        *//*从数据库分页查询*//*
    @GetMapping("/getUserInfo")
    public List<UserInfoDO> getUserInfo(@RequestParam(defaultValue = "1") Integer pageNum,
                                        @RequestParam(defaultValue = "10") Integer pageSize,
                                        @RequestParam(defaultValue = "") String search) {
        LambdaQueryWrapper<
                UserInfoDO> wrapper = Wrappers.<UserInfoDO>lambdaQuery().orderByAsc(UserInfoDO::getId); //通过用户昵称进行模糊搜索
        if (StrUtil.isNotBlank(search)) { //通过hutool工具类里的StrUtil直接判断search不为空
            wrapper.like(UserInfoDO::getNickName, search);  //从数据库查询的用户昵称=关键词search进行模糊查询
        }
        new Page<>(pageNum, pageSize); //分页对象， pageNum表示第几页，pageSize表示每一页的数据量
        userInfoMapper.findPage();
        List<UserInfoDO> queryUserInfoList = userInfoService.getUserInfoService();

        return queryUserInfoList;
    }


    @PutMapping("/getUserInfo")
    public List<UserInfoDO> getUserInfo(@RequestParam(defaultValue = "1") Integer pageNum,
                                        @RequestParam(defaultValue = "10") Integer pageSize,
                                        @RequestParam(defaultValue = "") String search) {
        LambdaQueryWrapper<
                UserInfoDO> wrapper = Wrappers.<UserInfoDO>lambdaQuery().orderByAsc(UserInfoDO::getId); //通过用户昵称进行模糊搜索
        if (StrUtil.isNotBlank(search)) { //通过hutool工具类里的StrUtil直接判断search不为空
            wrapper.like(UserInfoDO::getNickName, search);  //从数据库查询的用户昵称=关键词search进行模糊查询
        }
        new Page<>(pageNum, pageSize); //分页对象， pageNum表示第几页，pageSize表示每一页的数据量
        userInfoMapper.findPage()
        List<UserInfoDO> queryUserInfoList = userInfoService.getUserInfoService();

        return queryUserInfoList;
    }*/
}
//@PostMapping是新增、@PutMapping是更新、@GetMapping是查询
