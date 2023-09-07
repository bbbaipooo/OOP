package Program2;

public class Pro2_64011041 {
    public static void main(String[] args) {
        Course course=new Course("ART");
        course.addStudent("John");
        course.addStudent("Nicha");
        course.addStudent("Malee");
        course.dropStudent("Nicha");
        for(int i=0;i<course.getNumberOfStudent();i++){
            System.out.println("Student "+(i+1)+" is "+course.getStudent()[i]);
        }
        
        /* String[] dog = new String[] { "1", "2", "3" };
        String[] cat = new String[100];
        //cat=dog;
        
        System.arraycopy(dog, 0, cat, 0, 2);
        System.out.println(cat[0]+cat[1]+cat[2]); */
    }
}
