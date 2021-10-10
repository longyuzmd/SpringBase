package com.atguigu.base.entity;

import lombok.Data;

@Data
public class Car {

    private String carName;

    private String carColor;

    private String type;

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carColor='" + carColor + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
