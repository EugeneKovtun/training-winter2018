package ua.training.controller;

import ua.training.model.Model;
import ua.training.model.entities.Product;
import ua.training.view.View;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;
    private Scanner scanner;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        scanner = new Scanner(System.in);
    }

    public void processUser() {
        addNewProduct();
        model.getProducts().stream().map(Product::toString).forEach(view::printMessage);
    }

    private void addNewProduct() {
        Product product = new ProductController(view,scanner).getNewProduct();
        model.add(new Product());
    }

}
