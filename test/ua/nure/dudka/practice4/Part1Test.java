package ua.nure.dudka.practice4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Part1Test {
    @Test
    public void testToUperCase() {
        String testString = "it's test string";
        String expectedString = "it's TEST STRING";
        String actualString = Part1.toUpperCase(testString);

        assertEquals(expectedString, actualString);
    }
}
