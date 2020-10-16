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
public class Vote_option extends Model<Vote_option> {

    private static final long serialVersionUID = 1L;

    /**
     * 自身id
     */
    @TableId(value = "vo_id", type = IdType.AUTO)
    private Long vo_id;

    /**
     * 主题id
     */
    private Long vs_id;

    /**
     * 选项内容
     */
    private String vo_option;

    /**
     * 该项目获得的票数
     */
    private Integer vo_order;
}
