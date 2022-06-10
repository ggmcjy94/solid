package _03_liskov_substitution_principle._01_before;

public class Rectangle {

    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * 넓이 반환 함수
     *
     * @return [int] 넓이
     */
    public int getArea()
    {
        return width * height;
    }
}
