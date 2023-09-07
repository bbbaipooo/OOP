package Program3_3;

public class Rectangle extends GeometricObject {
    // Attributes
    private double width;
    private double height;

    // Constructors
    public Rectangle(){

    }

    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }

    public Rectangle(double width, double height,String color,boolean filled) {
        this.width=width;
        this.height=height;
        setColor(color);
        setFilled(filled);
    }

    // Methods
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height=height;
    }

    public double getArea() {
        return (this.width*this.height);
    }

    public double getPerimeter() {
        return 2*(this.width+this.height);
    }   

    public int compareTo(Rectangle o) {
        if (getArea() == o.getArea())
            return 1;
        else
            return 0;
    }
}
