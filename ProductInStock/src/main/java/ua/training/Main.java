package ua.training;

import ua.training.controller.Controller;
import ua.training.model.Model;
import ua.training.view.View;

public class Main {
    public static void main(String[] args) {
        new Controller(new Model(),new View(System.out)).processUser();
    }
}
