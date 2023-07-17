package com.example.effectivejava.chapter01.item01.staticfactorymethod;

import lombok.Getter;

@Getter
public class StaticFactoryMethod {

    private String name;

    private int age;

    public static StaticFactoryMethod nothing() {
        StaticFactoryMethod staticFactoryMethod = new StaticFactoryMethod();
        staticFactoryMethod.name = "";
        staticFactoryMethod.age =0;
        return staticFactoryMethod;
    }

    public static StaticFactoryMethod one(String name, int age) {
        StaticFactoryMethod staticFactoryMethod = new StaticFactoryMethod();
        staticFactoryMethod.name = name;
        staticFactoryMethod.age = age;
        return staticFactoryMethod;
    }

    public static StaticFactoryMethod two(String name) {
        StaticFactoryMethod staticFactoryMethod = new StaticFactoryMethod();
        staticFactoryMethod.name = name;
        return staticFactoryMethod;
    }
}

class constructor {
    public static void main(String[] args) {
        StaticFactoryMethod one = StaticFactoryMethod.one("이승우",29);
        System.out.println(one.getName());
        System.out.println(one.getAge());
        System.out.println();

        StaticFactoryMethod two = StaticFactoryMethod.two("이승우2");
        System.out.println(two.getName());
        System.out.println(two.getAge());
    }
}