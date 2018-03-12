package ua.training.controller;

import ua.training.model.Model;
import ua.training.view.View;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Controller {
    private View view;
    private Model model;
    private Scanner scanner;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        scanner = new Scanner(System.in);
    }

    public void processUser() {
        ControllerUtils utils = new ControllerUtils(new Scanner(System.in), view);
        addNewRecordToModel();
        view.printMessage(Arrays.toString(model.getRecords().toArray()));
    }

    private void addNewRecordToModel() {
        model.addRecord(new RecordController(scanner, view).getNewRecord(new Locale("en")));
    }

}
