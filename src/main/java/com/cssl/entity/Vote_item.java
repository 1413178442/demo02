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
public class Vote_item extends Model<Vote_item> {

    private static final long serialVersionUID = 1L;

    /**
     * 自身id
     */
    @TableId(value = "vi_id", type = IdType.AUTO)
    private Long vi_id;

    /**
     * 用户id
     */
    private Long vu_user_id;

    /**
     * 主题id
     */
    private Long vs_id;

    /**
     * 选项id
     */
    private Long vo_id;
}
