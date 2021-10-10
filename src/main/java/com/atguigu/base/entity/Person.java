package com.atguigu.base.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;

@Data
@Component

@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String name;

    private Integer age;

    private String nation;

    private Car car;

    private List<Book> books;

    private Map<String,Object> map;

    private Properties properties;

    public Person(Car car) {
        this.car = car;
    }

    public Person(String name, Integer age, String nation) {
        this.name = name;
        this.age = age;
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nation='" + nation + '\'' +
                ", car=" + car +
                ", books=" + books +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
