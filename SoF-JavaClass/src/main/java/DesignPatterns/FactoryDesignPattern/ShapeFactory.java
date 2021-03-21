package DesignPatterns.FactoryDesignPattern;

public class ShapeFactory {

    public Shape drawShapeFactory(String string) {
        if(string=="Square")
        {
            return new Square();
        }
        if(string=="Rectangle")
        {
            return new Rectangle();
        }
        if(string=="Circle")
        {
            return new Circle();
        }
        else {
            return null;
        }
    }
}
