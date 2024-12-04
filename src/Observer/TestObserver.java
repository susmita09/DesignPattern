package Observer;

public class TestObserver {
    public static  void main(String[] args){
        // Create products
        Product laptop = new Product("P1", "Laptop",4000);
        Product smartphone = new Product("P2", "Smartphone",3000);


        // Create inventory items
        InventoryItem laptopInventory = new InventoryItem(laptop, 0);
        InventoryItem smartphoneInventory = new InventoryItem(smartphone, 5);

        // Create buyers
        Buyer buyer1 = new Buyer("a1","Alice");
        Buyer buyer2 = new Buyer("a2","Bob");
        Buyer buyer3 = new Buyer("a3","Charlie");

        // Buyers subscribe to notifications for Laptop
        laptopInventory.add(buyer1); //can also give the method name as subscribe
        laptopInventory.add(buyer2);

        // Simulate stock updates
        System.out.println("Restocking Laptop...");
        laptopInventory.setStockCount(10); // Notify Alice and Bob
    }
}
