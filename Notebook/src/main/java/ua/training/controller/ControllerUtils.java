package ua.training.controller;

import ua.training.model.Model;
import ua.training.view.View;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ControllerUtils {
    private Scanner scanner;
    private View view;

    public ControllerUtils(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public static final String REGEX_BUNDLE_NAME = "regex";
    public static final String KEY_NAME = "name";
    public String getRegexByKey(Locale locale, String key) {
        return ResourceBundle.getBundle(
                REGEX_BUNDLE_NAME,
                locale).getString(key);
    }

    String inputStringWithScannerAndRegex(String message, String regex) {
        view.printMessage(message);
        String result;
        while (!(scanner.hasNext() && (result = scanner.next()).matches(regex))) {
            view.printWrongInputMessage(message);
        }
        return result;
    }
}
