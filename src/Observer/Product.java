package Observer;

public class Product {
    private String ProductId;
    private String name;
    private int price;

    public Product(String productId, String name, int price) {
        ProductId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId() {
        return ProductId;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
