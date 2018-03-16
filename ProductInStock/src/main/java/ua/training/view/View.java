package ua.training.view;

import java.io.PrintStream;
import java.util.Arrays;

public class View {
    public static final String INPUT = "Input";
    public static final String PRODUCT_NAME = "product name";
    public static final String MANUFACTURER = "manufacturer";
    public static final String PROVIDER = "provider";
    public static final String PROVIDER_PHONE = "provider phone";
    public static final String WRONG_INPUT = "Wrong input, try again!";

    private PrintStream stream;

    public View(PrintStream stream) {
        this.stream = stream;
    }

    public void printMessage(String message) {
        stream.println(message);
    }

    public String concatenateStrings(String... strings) {
        StringBuilder builder = new StringBuilder();
        Arrays.stream(strings).forEach(builder::append);
        return builder.toString();
    }
}
