package ua.nure.dudka.practice4;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class Part4Test {
    private Part4 part4 = new Part4("This is a test string. Hello there.");
    private Part4.IteratorImpl iterator = (Part4.IteratorImpl) part4.iterator();

    @Test
    public void testIterator() {
        Class expectedClass = Part4.IteratorImpl.class;
        Class actualClass = iterator.getClass();

        assertNotNull(iterator);
        assertEquals(expectedClass, actualClass);
    }

    @Test
    public void testHasNext() {
        assertTrue(iterator.hasNext());
    }

    @Test
    public void testNext() {
        String expectedString = "This is a test string.";

        assertTrue(iterator.hasNext());

        String actualStrng = (String) iterator.next();
        assertEquals(expectedString, actualStrng);
    }

    @Test(expected = NoSuchElementException.class)
    public void testNextException() {
        while (iterator.hasNext()) {
            iterator.next();
        }

        iterator.next();
    }

    @Test
    public void testMain() {
        part4.main(new String[]{});
    }
}
