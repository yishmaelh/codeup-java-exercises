package grades;

import java.util.ArrayList;

public class Student {

    private String studentName;
    private ArrayList<Integer> grades;

    public void setStudentName(String nameOfStudent){
        this.studentName = nameOfStudent;
        this.grades = new ArrayList<>();
    }

    public String getStudentName(){
        return studentName;
    }

    public ArrayList<Integer> getGrades(){
        return grades;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double sumOfGrades = 0;
        double amountOfGrades = grades.size();
        for(Integer grade :grades){
            sumOfGrades += grade;
        }
        return sumOfGrades/amountOfGrades;
    }

}
