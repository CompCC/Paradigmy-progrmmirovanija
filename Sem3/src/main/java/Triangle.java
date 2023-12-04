public class Triangle extends Shape {
    private final int sideA;
    private final int sideB;
    private final int sideC;

    public Triangle(int a, int b, int c) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }

    @Override
    double getArea() {
        double perim = getPerimeter() / 2;
        return Math.sqrt(perim * (perim - sideA) * (perim - sideB) * (perim - sideC));
    }

    @Override
    double getPerimeter() {
        return sideA + sideB + sideC;
    }
}
