package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int getPerimeter(int length, int width) {
        return (2 * length) + (2 * width);
    }

    int getArea(int length, int width) {
        return (length * width);
    }


}
