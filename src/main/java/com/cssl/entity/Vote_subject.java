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
public class Vote_subject extends Model<Vote_subject> {

    private static final long serialVersionUID = 1L;

    /**
     * 自身id
     */
    @TableId(value = "vs_id", type = IdType.AUTO)
    private Long vs_id;

    /**
     * 主题内容
     */
    private String vs_title;

    /**
     * 选项类型1.单选 2.多选
     */
    private Integer vs_type;

    //总选项
    private Integer options;

    //总票数
    private Integer total;
}
