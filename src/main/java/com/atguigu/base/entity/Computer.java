package com.atguigu.base.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Computer {

    private String name;

    private String color;

    private String cpuName;

    private String xkName;
}
