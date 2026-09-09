package dmit2015.model;

public class Product {

    // fields
    public String name;
    public double price;

    // Constructor Validation
    public Product(String name, double price) {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name is required.");
        }

        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive.");
        }
        this.name = name;
        this.price = price;
    }

    // getter method
    public String getName() { return name;}
    public double getPrice() {return price;}
}
