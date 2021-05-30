package liskov.badsample;

public class Ostrich implements Bird{

    @Override
    public void eating() {
        System.out.println("the ostrich is eating ...");
    }

    @Override
    public void sleeping() {
        System.out.println("the ostrich is sleeping ...");
    }

    //this method is not true for ostrich
    @Override
    public void flying() {
        System.out.println("the ostrich is flying ...");
    }
}
