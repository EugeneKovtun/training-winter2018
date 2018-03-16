package ua.training.view;

import java.io.PrintStream;
import java.util.Arrays;

public class View {
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
