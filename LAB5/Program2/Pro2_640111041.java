public class Pro2_640111041 {
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("The perimeter of polygon1 : "+polygon1.getPerimeter());
        System.out.println("The Area of polygon1 : "+polygon1.getArea());
        System.out.println("The perimeter of polygon2 : "+polygon2.getPerimeter());
        System.out.println("The Area of polygon2 : "+polygon2.getArea());
        System.out.println("The perimeter of polygon3 : "+polygon3.getPerimeter());
        System.out.println("The Area of polygon3 : "+polygon3.getArea());

    }
}
