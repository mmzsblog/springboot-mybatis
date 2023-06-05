package com.mmzsblog.mybatis.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author mmzsit
 * @since 2023-06-06
 */
@Data
public class UserTest implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String userName;


}
