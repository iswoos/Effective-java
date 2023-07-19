package com.example.effectivejava.chapter01.item03.staticfactory;

// 제네릭 싱글톤 팩토리 (24쪽)
public class MetaElvis<T> {

    private static final MetaElvis<Object> INSTANCE = new MetaElvis<>();

    private MetaElvis(){}

    @SuppressWarnings("unchecked")
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
    }
}
