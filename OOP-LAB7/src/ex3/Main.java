package ex3;
public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 3:");
        GeometricObject circle = new Circle(5);
        System.out.println("Circle:");
        System.out.println("radius: " + ((Circle) circle).getRadius());
        System.out.println("perimeter: " + circle.getPerimeter());
        System.out.println("ploshad: " + circle.getArea());
        System.out.println("strokovoe predstavlenie: " + circle.toString());
        ResizableCircle resizableCircle = new ResizableCircle(7);
        System.out.println("\nResizableCircle:");
        System.out.println("before resizing:");
        System.out.println("radius: " + resizableCircle.getRadius());
        System.out.println("perimeter: " + resizableCircle.getPerimeter());
        System.out.println("ploshad: " + resizableCircle.getArea());
        System.out.println("strokovoe predstavlenie: " + resizableCircle.toString());
        resizableCircle.resize(50);
        System.out.println("\nafter resizing by 50%:");
        System.out.println("radius: " + resizableCircle.getRadius());
        System.out.println("perimeter: " + resizableCircle.getPerimeter());
        System.out.println("ploshad: " + resizableCircle.getArea());
        System.out.println("strokovoe predstavlenie: " + resizableCircle.toString());

        System.out.println("\n4 esep");
        MovablePoint point = new MovablePoint(3, 5, 1, 1);
        System.out.println("Movable Point:");
        System.out.println("ishodnoe polozhenie: " + point.toString());
        point.moveUp();
        System.out.println("posle togo kak dvinulsya verh: " + point.toString());
        point.moveLeft();
        System.out.println("posle togo kak dvinulsya vlevo: " + point.toString());
        MovableCircle movableCircle = new MovableCircle(1, 1, 1, 1, 2);
        System.out.println("\nMovable Circle:");
        System.out.println("ishonoe poloshenie: " + movableCircle.toString());
        movableCircle.moveRight();
        System.out.println("posle togo kak dvinulsya v pravo: " + movableCircle.toString());
        movableCircle.moveDown();
        System.out.println("posle togo kak dvinulsya vniz: " + movableCircle.toString());
    }
}
