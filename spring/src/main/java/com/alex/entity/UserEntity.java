package com.alex.entity;

import lombok.Data;
import java.io.Serializable;
@Data
public class UserEntity implements Serializable {
    private static final long serialVersionUID = -8233400492862988387L;
    private int id;
    private String name;
    private int age;
    private String cup;
}
