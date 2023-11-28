public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(20);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        Triangle triangle = new Triangle(10,25,30);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
    }
}
