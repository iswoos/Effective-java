package com.example.effectivejava.chapter01.item04;

// 인스턴스화를 막으려거든 private 생성자를 활용하라
// 정적 메서드만 담은 유틸리티 클래스는 인스턴스로 만들어 쓰려고 설계한 클래스가 아니다
// private 생성자를 추가하면 클래스의 인스턴스화를 막을 수 있다
// 생성자에 주석으로 인스턴스화 불가한 이유를 설명하는 것이 좋다 (아래와 같이 서술)
public class UtilityClass {

    /*
    이 클래스는 인스턴스를 만들 수 없습니다
    */
    private UtilityClass() {
        throw new AssertionError();
    }

    public static String hello() {
        return "Hello";
    }

    public static void main(String[] args) {
        String hello = UtilityClass.hello();
        System.out.println(hello);
    }
}
