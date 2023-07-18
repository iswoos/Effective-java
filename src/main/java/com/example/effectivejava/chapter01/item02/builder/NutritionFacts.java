package com.example.effectivejava.chapter01.item02.builder;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

/*
생성자에 매개변수가 많다면 builder를 고려하라
점층적 생성자 패턴과 자바빈즈 패턴의 장점만 취했음 (17~18쪽)

@Builder 어노테이션의 단점
1. 전체 매개변수를 받는 생성자가 강제로 생긴다. -> @AllArgsConstructor(access = AccessLevel.PRIVATE)를 함으로써 생성자를 외부에서 쓰지 못하도록 막으면 됨
2. 필수값을 지정해줄 수 없음

결론
빌더 패턴은 빌더 하나로 여러 객체를 만들 수 있고, 빌더에 넘기는 매개변수에 따라 다른 객체를 만들 수 있으므로 매우 유연하다.
하지만 객체를 만들려면, 그에 앞서 빌더부터 만들어야한다. 또한, 성능에 민감한 상황에서는 빌더 생성 비용이 문제가 될 수 있다. 또한 매개변수가 4개 이상이 되어야 값어치를 한다.
즉, 인자가 많은 생성자나 정적 팩터리가 필요한 클래스를 설계할 때, 대부분의 인자가 선택적 인자인 상황에 유용하다. 빌더는 점층적 생성자보다 간결하고, 자바빈즈보다 훨씬 안전하다.
https://dahye-jeong.gitbook.io/java/java/effective_java/2021-01-13-builder-pattern
*/
@Builder
//@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFactsBuilder()
                .servingSize(100)
                .servings(10)
                .build();
    }
}
