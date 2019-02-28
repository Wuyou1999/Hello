package com.spring.annotation;

import org.springframework.stereotype.Component;

//采用注解开发的bean
//@Component用于级别注解
@Component
public class Hello {
    public String getHello(){
        return "Hello World";
    }
}
