package com.example.effectivejava.chapter01.item05.dependencyinjection;

import com.example.effectivejava.chapter01.item05.DefaultDictionary;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SpellCheckerTest {

    @Test
    void isValid() {
        SpellChecker spellChecker = new SpellChecker(new DefaultDictionary());
        boolean test = spellChecker.isValid("test");
        assertThat(test).isEqualTo(false);

    }


}