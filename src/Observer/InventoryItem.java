package Observer;

import java.util.ArrayList;
import java.util.List;

public class InventoryItem implements StockObservable{
    private Product product;
    private int stock;
    private List<Observer> subscribers = new ArrayList<>();

    public InventoryItem(Product p, int stock){
        this.product = p;
        this.stock = stock;
    }
    @Override
    public void add(Observer o) {
       subscribers.add(o);
    }

    @Override
    public void remove(Observer o) {
       subscribers.remove(o);
    }

    @Override
    public void notifySubscriber() {
        for(Observer obs : subscribers){
            obs.update(product.getName());
        }
    }

    @Override
    public void setStockCount(int quantity) {
        stock += quantity;
        System.out.println("Stock updated for "+ product.getName());

        if(stock > 0){
            notifySubscriber();
        }
    }

    public Product getProduct() {
        return product;
    }

    public int getStock() {
        return stock;
    }
}
