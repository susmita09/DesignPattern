package Decorator;


//step 3 : define the add on decorator

// addonDecorator is a abstract class implementing the coffee interface . it wraps the coffee object
 public abstract class AddOnDecorator implements Coffee{
    protected Coffee coffee;
    public AddOnDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public double getCost(){
        return coffee.getCost();
    }

    @Override
    public String getDescription(){
        return coffee.getDescription();
    }

}
