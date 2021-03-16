package DesignPatterns.AbstractFactoryPattern;

public class RoundedShapeFactory extends AbstractFactory {
    Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE"))
        {
            return new RoundedRectangle();
        }
        else if(shapeType.equalsIgnoreCase("SQUARE"))
        {
            return new RoundedSquare();
        }
        else {
            return null;
        }
    }
}
