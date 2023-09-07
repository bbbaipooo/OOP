package Program3_3;

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {
    // Constructors
    public ComparableRectangle(double width, double height) {
        super(width, height);
    }

    public ComparableRectangle(double width, double height,String color,boolean filled) {
        super(width, height);
        setColor(color);
        setFilled(filled);
    }

    @Override
    public int compareTo(ComparableRectangle o) {
        if (getArea() == o.getArea())
            return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "Area : " + getArea();
    }
}
