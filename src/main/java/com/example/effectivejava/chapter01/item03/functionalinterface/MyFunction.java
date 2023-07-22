package com.example.effectivejava.chapter01.item03.functionalinterface;

/*
FunctionalInterface는 여러 개의 디폴트 메서드가 있더라도 추상 메서드가
오직 하나면 되는 함수형 인터페이스이다

추상 메서드가 하나라는 뜻은 default method 또는 static method 는
여러 개 존재해도 상관 없다는 뜻이다

그리고 @FunctionalInterface 어노테이션을 사용하는데,
이 어노테이션은 해당 인터페이스가 함수형 인터페이스 조건에 맞는지 검사해준다

@FunctionalInterface 어노테이션이 없어도 함수형 인터페이스로 동작하고
사용하는 데 문제는 없지만, 인터페이스 검증과 유지보수를 위해 붙여주는 게 좋다
*/
@FunctionalInterface
public interface MyFunction {

    String valueOf(Integer integer);

    static String hello() {
        return "hello";
    }
}
