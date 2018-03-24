package JavaArrays;

public class Vehicle {
    private String model;
    private String color;
    private int price;


    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Vehicle(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
        System.out.println("Vehicle constructor called");

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void displayVehicleDetails()
    {
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Price: " + this.price);
    }

}

