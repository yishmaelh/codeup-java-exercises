package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int perimeter(int length, int width) {
        return (2 * length) + (2 * width);
    }

    int area(int length, int width) {
        return (length * width);
    }
}
