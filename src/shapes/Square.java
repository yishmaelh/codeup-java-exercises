package shapes;

public class Square extends Rectangle {


    public int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    public Square(int length, int width) {
        super(length, width);
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width){
        this.width = width;
    }


}
