package interfacesegregation.goodsample;

public class Cubic implements Shape, ThreeDimensionalShape {
    @Override
    public void area() {
        System.out.println("calculating area ...");
    }

    @Override
    public void volume() {
        System.out.println("calculating volume ...");
    }
}
