package _03_liskov_substitution_principle._01_before;

//정사각형 클래스
public class Square extends Rectangle{

    /**
     * 너비 할당 함수
     *
     * @param width: [int] 너비
     */
    @Override
    public void setWidth(int width)
    {
        super.setWidth(width);
        super.setHeight(getWidth());
    }

    /**
     * 높이 할당 함수
     *
     * @param height: [int] 높이
     */
    @Override
    public void setHeight(int height)
    {
        super.setHeight(height);
        super.setWidth(getHeight());
    }
}
