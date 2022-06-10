package _03_liskov_substitution_principle._01_before;

public class Client {


    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        rectangle.setWidth(10);
//        rectangle.setHeight(5);
//        System.out.println(rectangle.getArea()); // 50

        Rectangle square = new Square();
        square.setWidth(10);
        square.setHeight(5);

        // 정사각형문제이다보니 높이 넓이가 같아야 하므로 마지막으로 넣은 높이에 5가 width 까지 적용돼 25 가 나왔다. 그런대 직사각형일 경우에도
        // 같은 값이 나오니 lsp 를 준수하지 못한 코드가 된것이다.

        System.out.println(square.getArea()); // 25
    }
}
