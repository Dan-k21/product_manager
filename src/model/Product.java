package model;

public class Product {
    private int id;
    private String name;
    private int quantity;
    private int price;
    private String category;
    static int idIncrement = 1;

    public Product(String name, int quantity, int price, String category) {
        this.id = idIncrement;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
        idIncrement++;
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
}
