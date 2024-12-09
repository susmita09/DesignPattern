package Decorator;

// Each add-on is a decorator extending the AddOnDecorator.
public class MilkDecorator extends  AddOnDecorator{
    public MilkDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public double getCost(){
       return coffee.getCost() + 2.3;
    }

    @Override
    public String getDescription(){
        return coffee.getDescription() + " Milk";
    }
}
