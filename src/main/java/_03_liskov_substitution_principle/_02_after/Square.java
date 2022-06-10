package _03_liskov_substitution_principle._02_after;

//정사각형 클래스
public class Square extends Shape {
    /**
     * Square 생성자 함수
     *
     * @param length: [int] 길이
     */
    public Square(int length)
    {
        setWidth(length);
        setHeight(length);
    }
}
