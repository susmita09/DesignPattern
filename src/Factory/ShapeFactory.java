package Factory;

public class ShapeFactory {

    public Shape getShape(String input){
        if(input.equals( "rectangle")){
            return new Rectangle();
        }
        else if(input.equals("circle")){
            return new Circle();
        }
        return null;
    }
}
