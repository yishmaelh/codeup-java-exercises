package shapes;

abstract class Quadrilateral extends Shape implements Measurable{

    protected double length;
    protected double width;

    public Quadrilateral(){
        length = this.length;
        width = this.width;
    }

    double getLength(){
        return length;
    }

    double getWidth(){
        return width;
    }

    public abstract double setLength();
    public abstract double setWidth();



}
