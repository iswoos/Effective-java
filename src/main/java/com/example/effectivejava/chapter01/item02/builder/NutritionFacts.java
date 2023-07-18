package com.example.effectivejava.chapter01.item02.builder;

// 생성자에 매개변수가 많다면 builder를 고려하라
// 점층적 생성자 패턴과 자바빈즈 패턴의 장점만 취했음 (17~18쪽)
public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        private final int servingSize;
        private final int servings;

        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }
    }

}
