package ua.nure.dudka.practice4;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class Part2Test {
    private static final int[] SORTED_TEST_ARRAY = {3, 9, 16, 16, 18, 21, 23, 23, 29, 30};
    private static final int[] TEST_ARRAY = {30, 23, 16, 16, 9, 23, 3, 18, 21, 29};
    private static final String TEST_NUMBERS = "30 23 16 16 9 23 3 18 21 29";
    private static final String SORTED_TEST_FILE_NAME = "test_sorted.txt";
    private static final String NOT_SORTED_TEST_FILE_NAME = "test_not_sorted.txt";
    private static final String TEST_FILE_NAME = "test.txt";
    private Part2 part2 = new Part2();

    @Test
    public void testWrite() {
        part2.write(TEST_FILE_NAME ,TEST_NUMBERS);
        File file = new File(TEST_FILE_NAME);
        assertTrue(file.exists());
    }

    @Test
    public void testRead() {
        String actualString = part2.read(TEST_FILE_NAME);
        assertEquals(TEST_NUMBERS, actualString);
    }

    @Test
    public void testSortArray() {
        int[] actualArray = part2.sortArray(TEST_ARRAY);
        assertArrayEquals(SORTED_TEST_ARRAY, actualArray);
    }

    @Test
    public void testPerform() {
        part2.perform(NOT_SORTED_TEST_FILE_NAME, SORTED_TEST_FILE_NAME);
    }
}
