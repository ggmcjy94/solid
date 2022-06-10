package _03_liskov_substitution_principle._02_after;


//직사각형
public class Rectangle extends Shape{

    /**
     * Rectangle 생성자 함수
     *
     * @param width: [int] 너비
     * @param height: [int] 높이
     */
    public Rectangle(int width, int height)
    {
        setWidth(width);
        setHeight(height);
    }
}
