package com.sparta.jack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static java.lang.Math.abs;

public class RaindropsTests {

    private final RaindropsClass raindropsClass = new RaindropsClass();

    @Test
    @DisplayName("Test that 3 returns Pling")
    void testThat3ReturnsPling() {
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

    @Test
    @DisplayName("Test that 15 returns PlingPlang")
    
    void testThat15ReturnsPlingPlang() {
        Assertions.assertEquals("PlingPlang", raindropsClass.raindrops(15));
    }

    @Test
    @DisplayName("Test that 21 returns PlingPlong")
    void testThat21ReturnsPlingPlong() {
        Assertions.assertEquals("PlingPlong", raindropsClass.raindrops(21));
    }

    @Test
    @DisplayName("Test that 35 returns PlangPlong")
    void testThat35ReturnsPlangPlong() {
        Assertions.assertEquals("PlangPlong", raindropsClass.raindrops(35));
    }

    @Test
    @DisplayName("Test that 105 returns PlingPlangPlong")
    void testThat105ReturnsPlingPlangPlong() {
        Assertions.assertEquals("PlingPlangPlong", raindropsClass.raindrops(105));
    }

    @Test
    @DisplayName("Test that 0 returns PlingPlangPlong")
    void testThat0ReturnsPlingPlangPlong() {
        Assertions.assertEquals("PlingPlangPlong", raindropsClass.raindrops(0));
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 8, 17, -2, -8, -17})
    @DisplayName("Test that non factors of 3,5 or 7 return themselves including negatives")
    void testThatNonFactorsOf35Or7ReturnThemselvesIncludingNegatives(int n) {
        Assertions.assertEquals( Integer.toString(n), raindropsClass.raindrops(n));

    }

    @ParameterizedTest
    @ValueSource(ints = {-3,-5,-7,-15,-21,-25,-105})
    @DisplayName("Test that the program works for negative multiples of 3, 5 and 7")
    void testThatTheProgramWorksForNegativeMultiplesOf35And7(int n) {
        Assertions.assertEquals(raindropsClass.raindrops(abs(n)), raindropsClass.raindrops(n));
    }







}
