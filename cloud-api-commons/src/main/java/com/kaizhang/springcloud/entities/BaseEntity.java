package com.kaizhang.springcloud.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * @author kaizhang
 * @date 2020-09-30 0:33
 */
public class BaseEntity implements Serializable {
    /**
     * 主键
     */
    @TableId(type= IdType.AUTO)
    private Long id;
}
