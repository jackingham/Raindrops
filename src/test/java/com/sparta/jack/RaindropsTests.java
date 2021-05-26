package com.sparta.jack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RaindropsTests {

    private final RaindropsClass raindropsClass = new RaindropsClass();

    @Test
    @DisplayName("Test that 3 returns Pling")
    void testThat3Returns() {
        Assertions.assertEquals("Pling", raindropsClass.raindrops(3));
    }

    @Test
    @DisplayName("Test that 5 returns Plang")
    void testThat5ReturnsPlang() {
        Assertions.assertEquals("Plang", raindropsClass.raindrops(5));
    }

    @Test
    @DisplayName("Test that 7 returns Plang")
    void testThat7ReturnsPlang() {
        Assertions.assertEquals("Plong", raindropsClass.raindrops(7));
    }



}
