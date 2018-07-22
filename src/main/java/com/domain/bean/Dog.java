package com.domain.bean;

/**
 * created by zhouzhongyi on 2018/7/21
 */

/**
 * 每个Bean尽量提供无参构造方法，否则spring通过反射可能无法创建该Bean。见spring-test.xml
 */
public class Dog {
    private String name ;

    public Dog() {

    }
    public Dog(String name) {
        this.name = name ;
    }
}