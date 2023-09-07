package Program2;

public class Pro2_64011041 {
    public static void main(String[] args) {
        Square[] square = {new Square("red",true,2),new Square("yellow",true,3),new Square("blue",true,4),new Square("green",true,5),new Square("purple",true,6)};
        
        for(int i=0;i<5;i++){
            System.out.println();
            System.out.println("Area of square"+(i+1)+" : "+square[i].getArea());
            if(square[i].isFilled()){
                square[i].howToColor();
            }
        }
    }
}
