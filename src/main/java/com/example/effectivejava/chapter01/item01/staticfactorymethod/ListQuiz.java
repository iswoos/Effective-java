package com.example.effectivejava.chapter01.item01.staticfactorymethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListQuiz {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(20);
        numbers.add(44);
        numbers.add(1);

        System.out.println(numbers);

        Comparator<Integer> numbersDesc = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        };

//        Collections.sort(numbers,numbersDesc);
        numbers.sort(numbersDesc);

//      만약 이 리스트를 역순으로 나열하고 싶다면 아래와 같이 진행하면 됨
//      reversed()는 Comparator에 default 메서드로 지정되어 있으므로 아래와 같이 사용가능함
        numbers.sort(numbersDesc.reversed());
        System.out.println(numbers);
    }
}
