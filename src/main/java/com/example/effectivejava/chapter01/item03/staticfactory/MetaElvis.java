package com.example.effectivejava.chapter01.item03.staticfactory;

// 제네릭 싱글톤 팩토리 (24쪽)
public class MetaElvis<T> {

    private static final MetaElvis<Object> INSTANCE = new MetaElvis<>();

    private MetaElvis(){}

    @SuppressWarnings("unchecked")
    /*
    static 뒤에 제네릭이 또 선언되어 있는 이유
    클래스 레벨의 스코프가 아니다. 메서드 레벨의 스코프이다.
    메서드 레벨의 제네릭 타입 매개변수는 해당 메서드가 호출될 때 어떤 타입을 사용할지 결정하는 것이기 때문에 호출 시점에 타입이 결정됨
    */
    public static <T> MetaElvis<T> getInstance() { return (MetaElvis<T>) INSTANCE; }

    public void say (T t) {
        System.out.println(t);
    }

    public void leaveTheBuilding() {
        System.out.println("whoa baby, i'm outta here!");
    }

    public static void main(String[] args) {
        MetaElvis<String> elvis1 = MetaElvis.getInstance();
        MetaElvis<Integer> elvis2 = MetaElvis.getInstance();
        elvis1.say("hello");
        elvis2.say(100);
    }
}
