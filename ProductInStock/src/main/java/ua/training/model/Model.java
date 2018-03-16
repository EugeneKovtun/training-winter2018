package ua.training.model;

import ua.training.model.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public boolean add(Product product) {
        return products.add(product);
    }
}
