package test;

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}

