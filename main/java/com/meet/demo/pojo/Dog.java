package com.meet.demo.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
//只有是Spring 的组件才能使用Spring的强大功能
//注册成为组件
@ConfigurationProperties(prefix = "mydog")
@Component
public class Dog {
    private String name;
    private Integer age;
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
