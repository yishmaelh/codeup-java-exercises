package shapes;

public class Rectangle extends Quadrilateral implements Measurable{


    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double setLength() {
        return 0;
    }

    @Override
    public double setWidth() {
        return 0;
    }
}






//
////public class Rectangle {
////    protected int length;
////    protected int width;
////
////    public Rectangle(int length, int width) {
////        this.length = length;
////        this.width = width;
////    }
////
////   public int getPerimeter() {
////        return (2 * length) + (2 * width);
////    }
////
////  public  int getArea() {
////        return (length * width);
////    }
////
////
////}
