package src.entities;

public class Product1 {

    private String name;
    private Double price;

    public Product1 (String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String priceTag() {
        return name
                + " $ "
                + String.format("%.2f", price);
    }
}
