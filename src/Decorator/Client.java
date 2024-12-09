package Decorator;

public class Client {
    public static void main(String[] args){
        // Base coffee
        Coffee expresso = new Expresso();

        //add milk and chocolate
        Coffee custom = new ChocolateDecorator(new MilkDecorator(expresso));

        System.out.println(custom.getCost() + " " + custom.getDescription());
    }
}
