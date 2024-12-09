package Decorator;

//step 2. implement concreate components (Base coffee types)
public class Cappuccino implements Coffee {
    @Override
    public double getCost() {
        return 5.0;
    }

    @Override
    public String getDescription() {
         return "Cappuccino";
    }
}
