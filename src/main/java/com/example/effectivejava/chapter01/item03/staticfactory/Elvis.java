package com.example.effectivejava.chapter01.item03.staticfactory;

// 정적 팩터리 방식의 싱글턴 (24쪽)
public class Elvis {
    private static final Elvis INSTANCE = new Elvis();
    private Elvis() {}
    public static Elvis getInstance(){return INSTANCE;}

    public void leaveTHeBuilding() {
        System.out.println("whoa baby, i'm outta here!");
    }

    // 이 메서드는 보통 클래스 바깥 (다른 클래스)에 작성해야 한다!
    public static void main(String[] args) {
        Elvis elvis = Elvis.getInstance();
        elvis.leaveTHeBuilding();
    }

}
