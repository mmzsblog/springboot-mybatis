package com.mmzsblog.mybatis.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author mmzsblog.cn
 * @since 2023-06-06
 */
@Data
public class UserOther implements Serializable{

    private static final long serialVersionUID = 1L;

    private Long id;

    private String nickName;

}
