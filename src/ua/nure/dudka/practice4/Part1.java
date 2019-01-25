package ua.nure.dudka.practice4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part1 {
    private static final int MAX_WORD_LENGTH = 3;
    private static final String REGEX = "[A-zА-яЁёҐЄєІіЇї]+";

    public static String toUpperCase(String input) {
        StringBuffer buffer = new StringBuffer();
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(input);
        String machedWord;

        while (matcher.find()) {
            machedWord = matcher.group();
            if (machedWord.length() > MAX_WORD_LENGTH) {
                matcher.appendReplacement(buffer, machedWord.toUpperCase());
            }
        }

        matcher.appendTail(buffer);

        return String.valueOf(buffer);
    }

    public static void main(String[] args) {
        String input = Util.readFile("part1.txt");

        System.out.println(toUpperCase(input));
    }
}
