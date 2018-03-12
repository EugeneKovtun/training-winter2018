package ua.training;

import ua.training.controller.Controller;
import ua.training.model.Model;
import ua.training.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new View(System.out);
        Model model = new Model();
        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
