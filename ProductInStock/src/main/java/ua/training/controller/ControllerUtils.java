package ua.training.controller;

import ua.training.view.View;

import java.util.Scanner;

public class ControllerUtils {
    public static String getNewStringWithScanner(Scanner scanner) {
        return scanner.nextLine();
    }

    public static Integer getIntegerValueWithScanner(Scanner scanner, View view) {
        Integer integer;
        while (!scanner.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT);
        }
        integer = scanner.nextInt();
        return integer;
    }
}
