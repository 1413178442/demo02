package com.cssl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author .
 * @since 2020-10-09
 */
@Data
public class Vote_user extends Model<Vote_user> {

    private static final long serialVersionUID = 1L;

    /**
     * 自身id
     */
    @TableId(value = "vu_user_id", type = IdType.AUTO)
    private Long vu_user_id;

    /**
     * 用户名
     */
    private String vu_user_name;

    /**
     * 用户密码
     */
    private String vu_password;

    /**
     * 用户角色，1.管理员 2.普通用户
     */
    private Integer vu_status;
}
