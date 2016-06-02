package com.tongji.Springtest;

/**
 * Created by wb-cengyanyu on 2016/6/2.
 */
public class People {
    public String getName() {
        System.out.println(name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    public people(String name){
//        this.name=name;
//    }

    private String name;
}
