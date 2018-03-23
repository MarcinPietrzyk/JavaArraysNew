package JavaArrays;

public class Vehicle {
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

    public Vehicle(String color, int price) {
        this.color = color;
        this.price = price;
    }
}
