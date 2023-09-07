package Program2;

public class Course {
    private String courseName;
    private int numberOfStudent;
    private String[] student = new String[20];

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String[] getStudent() {
        return this.student;
    }

    public int getNumberOfStudent() {
        return this.numberOfStudent;
    }

    public void addStudent(String student) { // ex.student=4
        if (numberOfStudent == this.student.length) { // max = add index //ex. student = 1 2 3
            String[] temp = new String[this.student.length + 1]; //add 1 index // temp = _ _ _ _
            System.arraycopy(this.student, 0, temp, 0, this.student.length);   // temp = 1 2 3 _
            this.student=temp; //ทำให้studentมีindexที่เพิ่มขึ้นเหมือนtemp     // this.student = 1 2 3 _
        }
        this.student[numberOfStudent] = student;                       // this.student = 1 2 3 4 
        numberOfStudent++;
    }

    public int dropStudent(String student) {
        for (int i = 0; i < this.student.length; i++) {
            if (this.student[i].equals(student)) {  // equal = เทียบ   // ex.
                numberOfStudent--;                                    // numberOfStudent 1 2 3
                if (i != numberOfStudent) {                           // index = i       0 1 2
                    this.student[i] = this.student[numberOfStudent];  // data            a b c
                    //this.student[i] = this.student[i+1];
                }
                this.student[numberOfStudent] = null;
                return 0;
            }
        }
        System.out.println("Error::Cannot found this student.");
        return 0;
    }

    public void clear() {
        for (int i = 0; i < this.student.length; i++) {
            this.student[i] = null;
        }
        this.numberOfStudent = 0;
    }
}
