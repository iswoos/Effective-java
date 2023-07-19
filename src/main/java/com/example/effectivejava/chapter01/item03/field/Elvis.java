package com.example.effectivejava.chapter01.item03.field;

// public static final 필드 방식의 싱글톤 (23쪽)
public class Elvis {

    /*
    싱글톤 오브젝트
    */
    public static final Elvis INSTANCE = new Elvis();

    private Elvis(){}

    public void leaveTheBuilding() {
        System.out.println("whoa baby, i'm outta here!");
    }

    public void sing() {
        System.out.println("i'll have a blue~ chrismas without you~");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }
}
