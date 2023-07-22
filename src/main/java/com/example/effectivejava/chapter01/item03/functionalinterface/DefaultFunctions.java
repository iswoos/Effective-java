package com.example.effectivejava.chapter01.item03.functionalinterface;

import com.example.effectivejava.chapter01.item03.methodreference.Person;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DefaultFunctions {

    public static void main(String[] args) {
        // Function은 인풋(Integer)가 들어오면 아웃풋(String)을 return해주는 함수형 인터페이스이다.
        Function<Integer, String> intToString = Object::toString;
        /*Supplier는 인풋없이, 매개변수없이 아웃풋만을 return해주는 메서드이다.
        Person::new를 했을 때, new에 컴파일 에러가 발생하는 이유는 Person에 기본생성자가 없다는 의미이니,
        Person 클래스에 기본 생성자를 만들면 해당 에러가 해결된다.
        아래와 같이 코드를 작성하면, 파라미터가 아무것도없는 Person의 기본생성자를 사용하는 함수형 인터페이스가 된다
        */
        Supplier<Person> personSupplier = Person::new;
        // Person 클래스에서 LocalDate를 인풋으로 받고있는 생성자를 사용하는 함수형 인터페이스
        Function<LocalDate, Person> personFunction = Person::new;

        /*
        인풋은 있지만 return은 없음
        void이지만, Argument는 없는 메서드라고 생각하면 됨
        대표적인 예시로는 System.out.println이 됨
        (뭔가를 받아서 출력만 해주니까)
        */
        Consumer<Integer> iontergerConsumer = System.out::println;

        /*
        인풋을 받아서 boolean을 return함
        */
        Predicate<Integer> predicate;
    }
}
