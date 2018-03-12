package ua.training.view;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;

public class View {
    private static String MESSAGES_BUNDLE_NAME = "message";
    private ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    //  new Locale("ua"));  // Ukrainian
                    new Locale("en"));        // English

    public void setLocale(Locale locale) {
        bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, locale);
    }

    public static final String KEY_INPUT = "input";
    public static final String KEY_NAME = "name";
    public static final String KEY_SURNAME = "surname";
    public static final String KEY_NICKNAME = "nickname";
    public static final String KEY_COMMENT = "comment";
    public static final String KEY_PHONE = "phone";
    public static final String KEY_EMAIL="email";
    public static final String KEY_WRONG_INPUT = "wrong.input";

    public static final String DELIMITER = " ";

    private PrintStream stream;

    public View(PrintStream out) {
        stream = out;
    }

    public void printMessage(String message) {
        stream.println(message);
    }

    public String getStringByBundle(String key) {
        return bundle.getString(key);
    }

    public void printWrongInputMessage(String message) {
        printMessage(getStringByBundle(KEY_WRONG_INPUT));
        printMessage(message);
    }

    public String concatenateStrings(String... strings) {
        StringBuilder builder = new StringBuilder();
        Arrays.stream(strings).forEach(builder::append);
        return builder.toString();
    }
}
