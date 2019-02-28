package com.soft1721.spring.hello;

/**
 * Created by asus on 2019/2/25.
 */
public class Student {
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                '}';
    }

    private int age;
    private Phone phone;

    public Student(String name, int age, Phone phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student(){

    }

}
