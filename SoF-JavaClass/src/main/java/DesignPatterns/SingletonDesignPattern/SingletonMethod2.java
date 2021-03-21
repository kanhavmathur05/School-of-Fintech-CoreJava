package DesignPatterns.SingletonDesignPattern;

public class SingletonMethod2 {

    private static SingletonMethod2 INSTANCE;

    public SingletonMethod2() {
    }

    public static SingletonMethod2 getInstance() {


        if (INSTANCE == null) {
            synchronized (SingletonMethod2.class) {
                if (INSTANCE == null) {
                    System.out.println("Object Created!!");
                    INSTANCE = new SingletonMethod2();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String args[]) {
        SingletonMethod2 newObj=SingletonMethod2.getInstance();

    }
}
