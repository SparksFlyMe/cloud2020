package com.kaizhang.springcloud.entities;


import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author kaizhang
 * @since 2020-09-30
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 学号
     */
    private String studentId;


}
