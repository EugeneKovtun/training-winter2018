package ua.training.controller;

import ua.training.model.Model;
import ua.training.view.View;

public class Controller {
    private View view;
    private Model model;
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    public void processUser(){

    }
}
