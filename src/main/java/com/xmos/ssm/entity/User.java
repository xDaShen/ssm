package com.xmos.ssm.entity;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private String pwd;
    private Integer age;
}
