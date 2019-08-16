package com;

import lombok.Data;

import java.io.Serializable;

/**
 * @author alex
 * @Title: User
 * @ProjectName spring
 * @Description: TODO
 * @date 2019/1/6  15:24
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
}
