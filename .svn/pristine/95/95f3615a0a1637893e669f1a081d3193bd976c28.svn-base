package ua.nure.dudka.practice4;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Part5Test {
    private static final String TEST_STRING = "Hello there";
    private static final InputStream STD_IN = System.in;
    private static final String KEY_TABLE = "table";
    private static final String KEY_APPLE = "apple";
    private static final String RU_LOCALE = "ru";
    private static final String EN_LOCALE = "en";
    private Part5 part5 = new Part5();

    @Test
    public void testParseString() {
        String[] expectedArray = {"Hello", "there"};
        String[] actualArray = part5.parseString(TEST_STRING);

        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testGetEnTableResources() {
        String expectedString = "table";
        String actualString = part5.getResource(KEY_TABLE, EN_LOCALE);

        assertEquals(expectedString, actualString);
    }

    @Test
    public void testGetEnAppleResources() {
        String expectedString = "apple";
        String actualString = part5.getResource(KEY_APPLE, EN_LOCALE);

        assertEquals(expectedString, actualString);
    }

    @Test
    public void testGetRuTableResources() {
        String expectedString = "стол";
        String actualString = new String(part5.getResource(KEY_TABLE, RU_LOCALE).getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);

        assertEquals(expectedString, actualString);
    }

    @Test
    public void testGetRuAppleResources() {
        String expectedString = "яблоко";
        String actualString = new String(part5.getResource(KEY_APPLE, RU_LOCALE).getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);

        assertEquals(expectedString, actualString);
    }

    @Test
    public void testMain() {
        System.setIn(new ByteArrayInputStream(
                "table ru^table en^apple ru^stop".replace("^", System.lineSeparator()).getBytes(StandardCharsets.ISO_8859_1)));
        Part5.main(new String[]{});
        System.setIn(STD_IN);
    }
}
