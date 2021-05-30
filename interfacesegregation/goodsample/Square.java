package interfacesegregation.goodsample;

public class Square implements Shape {
    @Override
    public void area() {
        System.out.println("calculating area ...");
    }
}
