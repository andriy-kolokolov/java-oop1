package org.lessons.java.shop;

public class Product {
    private final int id;
    private String name;
    private String description;
    private double price;
    private double iva;

    public Product(int id, String name, String description, double price, double iva) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    // Default constructor with a default 0.22 iva
    public Product(int id, String name, String description, double price) {
        this(id, name, description, price, 0.22);
    }

    @Override
    public String toString() {
        return "Product " + getId() + ':' +
                "\n - id: " + String.format("%08d", id) +
                "\n - name: " + name +
                "\n - description: " + description +
                "\n - net price: " + String.format("%.2f", this.price) +
                "\n - gross price(including iva price): " + String.format("%.2f", price) +
                "\n - " + (iva == 0.22 ? "default iva: " + iva : "custom iva: " + iva);
    }

    public double getIvaPrice() {
        return price * iva + price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
}
