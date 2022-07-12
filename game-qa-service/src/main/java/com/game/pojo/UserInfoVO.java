package com.game.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author 11123357
 * @Date 2020/9/26 11:57
 * @Version 1.0
 */
@Data
public class UserInfoVO {
    @TableId(type = IdType.AUTO) /*设置id为自动生成的自增id*/
    private Integer id;
    private String username;
    private String nickName;
    private String passWord;
    private Integer age;
    private String sex;
    private String address;
}
