package grades;

import java.util.ArrayList;

public class Student {

    private String studentName;
    private ArrayList<Integer> grades;


    public void setStudentName(String nameOfStudent) {
        this.studentName = nameOfStudent;
        this.grades = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double sumOfGrades = 0;
        double amountOfGrades = grades.size();
        for (Integer grade : grades) {
            sumOfGrades += grade;
        }
        return sumOfGrades / amountOfGrades;
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentName("Yish");

        student1.addGrade(70);
        student1.addGrade(93);
        student1.addGrade((86));

        System.out.println(student1.getStudentName() + " has an average of " + student1.getGradeAverage());

    }
}


