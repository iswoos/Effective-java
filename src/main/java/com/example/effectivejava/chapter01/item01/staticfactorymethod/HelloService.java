package com.example.effectivejava.chapter01.item01.staticfactorymethod;

public interface HelloService {

    String hello();

    public static HelloService of(String lang) {
        if (lang.equals("ko")) {
            return new KoreanHelloService();
        } else {
            return new EnglishHelloService();
        }
    }
}
