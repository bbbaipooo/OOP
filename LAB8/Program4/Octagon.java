package Program4;

public class Octagon extends GeometricObject implements Cloneable,Comparable<Octagon>{
    // Attributes
    private double side;

    // Constructors
    public Octagon(double side) {
        this.side = side;
    }

    // Methods
    public double getArea() {
        return (2+4/22)*this.side * this.side;
    }

    public double getPerimeter() {
        return this.side * 8;
    }

    @Override
    protected Octagon clone() throws CloneNotSupportedException {
        return (Octagon) super.clone();
    }

    @Override
    public int compareTo(Octagon o) {
        if (this.getArea() == o.getArea()) {
            return 1;
        } else {
            return 0;
        }
    }
}
