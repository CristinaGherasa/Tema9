package org.tema9_exercise1;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(10.99, "Generic Product", "A generic product description", 5);
        Cosmetics cosmetics = new Cosmetics(19.99, "Lipstick", "A red lipstick",
                2, "Red", 0.05);
        Electronics electronics = new Electronics(99.99, "Smartphone", "A powerful smartphone",
                1, "Mobile", 5.7, 2.8, 0.3, 0.15);
        Fridge fridge = new Fridge(799.99, "Refrigerator", "A spacious refrigerator", 1,
                "Appliance", 70.5, 35.0, 175.0, 85.0, 4);


        System.out.println("Product: " + product.getName() + " is " +  product.getDescription() + ", Price: "
                + product.getPrice() + ", Quantity: " + product.getQuantity());

        System.out.println("Cosmetics: " + cosmetics.getName() + " is " + cosmetics.getDescription() +  ", Color: "
                + cosmetics.getColor() + ", Price: " + cosmetics.getPrice() + ", Quantity: " + cosmetics.getQuantity()
                + ", Weight: " + cosmetics.getWeight());

        System.out.println("Electronics: " + electronics.getName() + ", Price: " + electronics.getPrice() + ", Type: "
                + electronics.getType() + " is " + electronics.getDescription() + ", Quantity: " +
                electronics.getQuantity() + ", Length: " + electronics.getLength() + ", Width: " + electronics.getWidth()
                + ", Height: " + electronics.getHeight() + ", Weight: " + electronics.getWeight());

        System.out.println("Fridge: " + fridge.getName() + ", Price: " + fridge.getPrice() + " is "
                + fridge.getDescription() + ", Quantity: " + fridge.getQuantity() + ", Type: " + fridge.getType()
                + ", Length: " + fridge.getLength() + ", Width: " + fridge.getWidth() + ", Height: " + fridge.getHeight()
                + ", Weight: " + fridge.getWeight() + ", Temperature: " + fridge.getTemperature() + "°C");
    }
}