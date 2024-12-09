package Decorator;

public class Latte implements  Coffee{
    @Override
    public double getCost() {
        return 6.99;
    }

    @Override
    public String getDescription() {
        return "Latte";
    }
}
