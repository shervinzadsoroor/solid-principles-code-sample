package singleresponsible;

public class SingleResponsibleSample {
    //bad example
    private void calculatePerimeterAndArea() {
        int radius = 5;
        float pNumber = 3.14f;
        float perimeter = 2 * pNumber * radius;
        System.out.println("perimeter = " + perimeter);
        float area = pNumber * radius * radius;
        System.out.println("area = " + area);
    }

    // good example
    private void calculate() {
        int radius = 5;
        float pNumber = 3.14f;
        calculatePerimeter(radius, pNumber);
        calculateArea(radius, pNumber);
    }
    private void calculatePerimeter(int radius, float pNumber) {
        float perimeter = 2 * pNumber * radius;
        System.out.println("perimeter = " + perimeter);
    }
    private void calculateArea(int radius, float pNumber) {
        float area = pNumber * radius * radius;
        System.out.println("area = " + area);
    }
}
