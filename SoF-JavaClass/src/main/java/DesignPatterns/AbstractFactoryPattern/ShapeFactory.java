package DesignPatterns.AbstractFactoryPattern;

public class ShapeFactory extends AbstractFactory {
    Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE"))
        {
            return new Rectangle();
        }
        else if(shapeType.equalsIgnoreCase("SQUARE"))
        {
            return new Square();
        }
        else {
            return null;
        }
    }
}
