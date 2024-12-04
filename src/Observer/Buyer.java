package Observer;

public class Buyer implements Observer{
    private String id;
    private String name;

    public Buyer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void update(String productName) {
       //now here we can mention the business logic what we want to do if any update happen
        System.out.println(productName + "is now Back in stock you can order");
    }
}
