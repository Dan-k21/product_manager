package model;

import dao.ReadAndWriteProductList;

import java.util.List;

public class Product {
    private int id;
    private String name;
    private int quantity;
    private int price;
    private String category;
    public Product() {}
    private ReadAndWriteProductList readAndWriteProductList = new ReadAndWriteProductList();
    public Product(String name, int quantity, int price, String category) {
        List<Product> productList = readAndWriteProductList.readFile();
        if (productList.isEmpty()) {
            this.id = 0;
        } else {
            this.id = productList.get(productList.size() - 1).getId() + 1;
        }
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
    }
    public Product(int id, String name, int quantity, int price, String category) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + ", " +
                "Name: " + getName() + ", " +
                "Quantity: " + getQuantity() + ", " +
                "Price: " + getPrice() + ", " +
                "Category: " + getCategory();
    }
}
