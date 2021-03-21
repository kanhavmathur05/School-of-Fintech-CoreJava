package DesignPatterns.FactoryDesignPattern;

public class MainUI {
    public static void main(String args[])
    {
        ShapeFactory shapeObj=new ShapeFactory();
        Shape shape=shapeObj.drawShapeFactory("Rectangle");
        shape.drawShape();
    }
}
