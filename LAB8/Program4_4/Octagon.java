package Program4;

public class Octagon extends GeometricObject implements Comparable<Octagon>,Cloneable {
    private double side;

    public Octagon() {
        super();
    }

    public Octagon(double side) {
        super();
        this.side = side;
    }

    public Octagon(double side,String color,boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public int compareTo(Octagon o) {
        if (getArea() > o.getArea()) {
            return 1;
        }
        else if (getArea() < o.getArea()) {
            return -1;
        }
        return 0;
    }

    @Override
    protected Octagon clone() throws CloneNotSupportedException {
        return (Octagon) super.clone();
    }

    @Override
    public double getArea() {
        return (2 + 4/22) * side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 8;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Area : " + getArea() + "\n" +
                "Perimeter : " + getPerimeter();
    }
}