package DesignPatterns.SingletonDesignPattern;

public class SingletonMethod1 {

    private static SingletonMethod1 obj;

    private SingletonMethod1() {
    }

    public static SingletonMethod1 getInstance() {
        if (obj == null) {
            obj = new SingletonMethod1();
        }
        return obj;
    }

    public static void main(String args[])
    {
        SingletonMethod1.getInstance();
    }
}
