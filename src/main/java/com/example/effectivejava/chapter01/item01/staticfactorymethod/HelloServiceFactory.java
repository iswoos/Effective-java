package com.example.effectivejava.chapter01.item01.staticfactorymethod;

public class HelloServiceFactory {
    public static void main(String[] args) {
        String ko = HelloService.of("ko").hello();
        System.out.println(ko);

        System.out.println(HelloService.bye());
    }
}
