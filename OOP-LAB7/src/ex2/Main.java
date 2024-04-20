package ex2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 2:");
        Shape s1 = new Circle(5.5, "red", false);
        System.out.println(s1);
        System.out.println("ploshad: " + s1.getArea());
        System.out.println("perimeter: " + s1.getPerimeter());
        System.out.println("cvet: " + s1.getColor());
        System.out.println("zapolnen: " + s1.isFilled());
        Circle c1 = (Circle) s1;
        System.out.println(c1);
        System.out.println("ploshad: " + c1.getArea());
        System.out.println("perimeter: " + c1.getPerimeter());
        System.out.println("cvet: " + c1.getColor());
        System.out.println("zapolnen: " + c1.isFilled());
        System.out.println("radius: " + c1.getRadius());

        Shape s2 = new Shape() {
            @Override
            public double getArea() {
                return 0;
            }
            @Override
            public double getPerimeter() {
                return 0;
            }
        };
        Shape s3 = new Rectangle(1.0, 2.0, "red", false);
        System.out.println(s3);
        System.out.println("ploshad: " + s3.getArea());
        System.out.println("perimeter: " + s3.getPerimeter());
        System.out.println("cvet: " + s3.getColor());
        Rectangle r1 = (Rectangle) s3;
        System.out.println(r1);
        System.out.println("ploshad: " + r1.getArea());
        System.out.println("cvet: " + r1.getColor());
        System.out.println("dlina: " + r1.getLength());
        Shape s4 = new Square(6.6);
        Rectangle r2 = (Rectangle) s4;
        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println("ploshad: " + sq1.getArea());
        System.out.println("cvet: " + sq1.getColor());
        System.out.println("bok: " + sq1.getSide());
    }
}
