package grades;

import java.util.ArrayList;

public class Student {

    private String studentName;
    private ArrayList<Integer> grades;

    public void setStudentName(String nameOfStudent){
        this.studentName = nameOfStudent;
        this.grades =  new ArrayList<>();
    }
}
