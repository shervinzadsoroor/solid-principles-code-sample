package openclose;

public class Dog extends Animal {
    private void barking() {
        System.out.println("the dog is barking ...");
    }

    @Override
    protected void eating() {
        super.eating();
        System.out.println("the dog is eating meats ...");
    }
}
