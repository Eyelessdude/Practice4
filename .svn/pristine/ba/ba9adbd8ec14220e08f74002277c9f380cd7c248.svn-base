package ua.nure.dudka.practice4;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part4 implements Iterable {
    private String input;

    Part4(String input) {
        this.input = input;
    }

    @Override
    public Iterator iterator() {
        return new IteratorImpl();
    }

    public class IteratorImpl implements Iterator {
        private static final String REGEX = "([A-ZА-Я])([\\S\\s][^.]+)(\\.)";
        private boolean hasMatcherNext;
        private Pattern pattern;
        private Matcher matcher;

        IteratorImpl() {
            pattern = Pattern.compile(REGEX);
            matcher = pattern.matcher(input);
            hasMatcherNext = matcher.find();
        }

        @Override
        public boolean hasNext() {
            return hasMatcherNext;
        }

        @Override
        public Object next() {
            if (!hasMatcherNext) {
                throw new NoSuchElementException("There is no such element");
            }

            String result = matcher.group().replace(System.lineSeparator(), "");
            hasMatcherNext = matcher.find();

            return result;
        }
    }

    public static void main(String[] args) {
        String input = Util.readFile("part4.txt");

        Part4 sentences = new Part4(input);

        for (Object sentence : sentences) {
            System.out.println(sentence);
        }
    }
}
