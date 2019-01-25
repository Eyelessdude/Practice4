package ua.nure.dudka.practice4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Part3Test {
    private static final String DOUBLE_REGEX = "^(((-|)?\\d+\\.(\\d+|))|((-|)?\\.\\d+))$";
    private static final String TEST_STRING = "a bcd 43.43 432 и л фвыа 89 .98";
    private static final String STRING_REGEX_STRING = "String";
    private static final String DOUBLE_REGEX_STRING = "double";
    private static final String INTEGER_REGEX = "^(-|)?\\d+$";
    private static final String STRING_REGEX = "[A-zА-я]{2,}";
    private static final String INTEGER_REGEX_STRING = "int";
    private static final String CHAR_REGEX_STRING = "char";
    private static final String CHAR_REGEX = "^\\S$";
    private Part3 part3 = new Part3();

    @Test
    public void testGetStringRegex() {
        String actualRegex = part3.getRegex(STRING_REGEX_STRING);
        assertEquals(STRING_REGEX, actualRegex);
    }

    @Test
    public void testGetDoubleRegex() {
        String actualRegex = part3.getRegex(DOUBLE_REGEX_STRING);
        assertEquals(DOUBLE_REGEX, actualRegex);
    }

    @Test
    public void testGetCharRegex() {
        String actualRegex = part3.getRegex(CHAR_REGEX_STRING);
        assertEquals(CHAR_REGEX, actualRegex);
    }

    @Test
    public void testGetIntRegex() {
        String actualRegex = part3.getRegex(INTEGER_REGEX_STRING);
        assertEquals(INTEGER_REGEX, actualRegex);
    }

    @Test
    public void testGetString() {
        String actualString = part3.getString(TEST_STRING, DOUBLE_REGEX);
        String expectedString = "43.43 .98";

        assertEquals(expectedString, actualString);
    }
}
