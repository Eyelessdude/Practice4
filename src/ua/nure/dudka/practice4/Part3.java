package ua.nure.dudka.practice4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part3 {
    private static final String DOUBLE_REGEX = "^(((-|)?\\d+\\.(\\d+|))|((-|)?\\.\\d+))$";
    private static final String INTEGER_REGEX = "^(-|)?\\d+$";
    private static final String STRING_REGEX = "[A-zА-я]{2,}";
    private static final String SEPARATOR_REGEX = "\\S+";
    private static final String CHAR_REGEX = "^\\S$";

    public String getRegex(String type) {
        String regexType;

        switch (type) {
            case "char":
                regexType = CHAR_REGEX;
                break;
            case "int":
                regexType = INTEGER_REGEX;
                break;
            case "double":
                regexType = DOUBLE_REGEX;
                break;
            default:
                regexType = STRING_REGEX;
        }

        return regexType;
    }

    public String getString(String input, String regex) {
        StringBuilder builder = new StringBuilder();
        Pattern pattern = Pattern.compile(SEPARATOR_REGEX);
        Matcher spaceMatcher = pattern.matcher(input);
        Matcher typeMatcher;


        while (spaceMatcher.find()) {
            typeMatcher = Pattern.compile(regex)
                    .matcher(spaceMatcher.group());

            if (typeMatcher.find()) {
                builder.append(typeMatcher.group()).append(" ");
            }
        }

        return String.valueOf(builder).trim();
    }

    public static void main(String[] args) {
        String input = Util.readFile("part3.txt");

        Scanner scanner = new Scanner(System.in, "Cp1251");
        Part3 part3 = new Part3();
        String resultString;
        String regex;

        while (scanner.hasNextLine()) {
            String inputString = scanner.nextLine();

            if ("stop".equals(inputString)) {
                break;
            }

            regex = part3.getRegex(inputString);
            resultString = part3.getString(input, regex);
            System.out.println(resultString);
        }

    }
}
