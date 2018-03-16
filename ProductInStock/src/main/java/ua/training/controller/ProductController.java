package ua.training.controller;

import ua.training.model.entities.Product;
import ua.training.view.View;

import java.util.Scanner;

public class ProductController {
    public ProductController(View view, Scanner scanner) {
    }

    public Product getNewProduct() {
        return  new Product();
    }
}
