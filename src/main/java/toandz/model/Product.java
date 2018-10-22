package toandz.model;

public class Product {
    int code;
    String name = "";
    double price;
    String origin = "";
    String picture ="";

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Product(int code, String name, double price, String origin) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.origin = origin;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.code = randomId();
    }

    public Product(int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    private int randomId() {
        return (int) (Math.random() * 10000 + 10000);
    }
}