package liskov.goodsample;

public class Sparrow implements FlyingBirds {
    @Override
    public void eating() {
        System.out.println("the sparrow is eating ...");
    }

    @Override
    public void sleeping() {
        System.out.println("the sparrow is sleeping ...");
    }

    @Override
    public void flying() {
        System.out.println("the sparrow is flying ...");
    }
}
