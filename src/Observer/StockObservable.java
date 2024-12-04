package Observer;

public interface StockObservable {
    public void add(Observer o);
    public void remove(Observer o);
    public void notifySubscriber();
    public void setStockCount(int count);
}
