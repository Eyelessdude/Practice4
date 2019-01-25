package ua.nure.dudka.practice4;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Part5 {
    private static final String BUNDLE_NAME = "resources";

    public String getResource(String key, String locale) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle(BUNDLE_NAME, new Locale(locale));

        return resourceBundle.getString(key);
    }

    public String[] parseString(String string) {
        return string.split("\\s+");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Cp1251");
        Part5 resource = new Part5();
        String[] parcedString;
        String key;
        String locale;

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if ("stop".equals(input)) {
                break;
            }

            parcedString = resource.parseString(input);
            key = parcedString[0];
            locale = parcedString[1];
            System.out.println(resource.getResource(key, locale));
        }
    }
}
