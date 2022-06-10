package _03_liskov_substitution_principle._02_after;

public class Client {


    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 5);
        Shape square = new Square(5);

        System.out.println(rectangle.getArea());
        System.out.println(square.getArea());
    }
}
