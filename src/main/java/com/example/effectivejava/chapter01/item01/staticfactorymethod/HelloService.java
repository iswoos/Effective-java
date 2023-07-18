package com.example.effectivejava.chapter01.item01.staticfactorymethod;

public interface HelloService {

    String hello();

    //인스턴스에서만 호출할 수 있는 메서드를 정의할 것이냐
    default String hi(){
        prepareMessage();
        return "hi";
    }

    // 인스턴스를 만들지않고도 호출할 수 있는 정적인 스태틱 메서드를 정의할 것이냐
    static String bye(){
        prepareMessage();
        return "bye";
    }

    // 밖으로 공개는 안되고, 내부에 있는 다른 메서드들에서 사용하기위해 있는 메서드
    // 로직을 간추리기위한 용도로 사용함
    static private void prepareMessage() {
    }


    public static HelloService of(String lang) {
        if (lang.equals("ko")) {
            return new KoreanHelloService();
        } else {
            return new EnglishHelloService();
        }
    }
}
