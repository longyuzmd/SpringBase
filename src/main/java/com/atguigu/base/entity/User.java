package com.atguigu.base.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {

    private String name;

    private String gender;

    private Integer age;

}
