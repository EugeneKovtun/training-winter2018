package ua.training.controller;

import ua.training.model.entities.Product;
import ua.training.view.View;

import java.util.Scanner;

public class ProductController {
    private View view;
    private Scanner scanner;

    public ProductController(View view, Scanner scanner) {
        this.view = view;
        this.scanner = scanner;
    }

    public Product getNewProduct() {
        Product product = new Product();
        view.printMessage(view.concatenateStrings(View.INPUT, View.PRODUCT_NAME));
        String name = ControllerUtils.getNewStringWithScanner(scanner);
        view.printMessage(view.concatenateStrings(View.INPUT, View.MANUFACTURER));
        String manufacturer = ControllerUtils.getNewStringWithScanner(scanner);
        view.printMessage(view.concatenateStrings(View.INPUT, View.PROVIDER));
        String provider = ControllerUtils.getNewStringWithScanner(scanner);
        view.printMessage(view.concatenateStrings(View.INPUT, View.PROVIDER_PHONE));
        String providerPhone = ControllerUtils.getNewStringWithScanner(scanner);
        view.printMessage(view.concatenateStrings(View.INPUT, View.PROVIDER_PHONE));
        String manufacturerPhone = ControllerUtils.getNewStringWithScanner(scanner);
        view.printMessage(view.concatenateStrings(View.INPUT, View.PROVIDER_PHONE));
        Integer amount = ControllerUtils.getIntegerValueWithScanner(scanner, view);
        view.printMessage(view.concatenateStrings(View.INPUT, View.PROVIDER_PHONE));
        Integer price = ControllerUtils.getIntegerValueWithScanner(scanner, view);

        product.setName(name);
        product.setManufacturer(manufacturer);
        product.setProvider(provider);
        product.setProviderPhone(providerPhone);
        product.setManufacturerPhone(manufacturerPhone);
        product.setAmount(amount);
        product.setPrice(price);
        return product;
    }
}
