package Decorator;

public class ChocolateDecorator extends AddOnDecorator{
    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost(){
        return coffee.getCost() + 0.78;
    }

    @Override
    public String getDescription(){
        return coffee.getDescription() + " Chocolate";
    }
}
