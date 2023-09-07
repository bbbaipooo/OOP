package Program4;

public class Pro4_64011041 {
    public static void main(String[] args) throws Exception{
        Octagon octagon1 = new Octagon(5);
        System.out.println(octagon1.getArea());
        System.out.println(octagon1.getPerimeter());

        Octagon octagon2 = octagon1.clone();
        System.out.println("Clone octagon...");

        int compare = octagon1.compareTo(octagon2);
        if (compare == 0) {
            System.out.println("Octagon is equal!");
        }
        else
            System.out.println("Octagon is not equal!");
    }
}