package ua.nure.dudka.practice4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UtilTest {
    private static final String TEST_STRING = "30 23 16 16 9 23 3 18 21 29";
    private static final String FILE_PATH = "test.txt";

    @Test
    public void testReadFile() {
        String actualString = Util.readFile(FILE_PATH);
        assertEquals(TEST_STRING, actualString);
    }
}
