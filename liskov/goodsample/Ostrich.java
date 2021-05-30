package liskov.goodsample;

public class Ostrich implements NonFlyingBirds {

    @Override
    public void eating() {
        System.out.println("the ostrich is eating ...");
    }

    @Override
    public void sleeping() {
        System.out.println("the ostrich is sleeping ...");
    }

    @Override
    public void doSomething() {
        System.out.println("ostrich is doing something ...");
    }
}
