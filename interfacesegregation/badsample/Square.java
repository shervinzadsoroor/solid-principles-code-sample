package interfacesegregation.badsample;

public class Square implements Shape {
    @Override
    public void area() {
        System.out.println("calculating area ...");
    }

    // this is a redundant method
    @Override
    public void volume() {

    }
}
