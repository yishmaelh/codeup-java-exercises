package grades;

import java.util.HashMap;


public class GradesApplication {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentName("Yish");
        student1.addGrade(87);
        student1.addGrade(98);
        student1.addGrade(96);

        Student student2 = new Student();
        student2.setStudentName("Blaze");
        student2.addGrade(76);
        student2.addGrade(65);
        student2.addGrade(94);

        Student student3 = new Student();
        student3.setStudentName("Viz");
        student3.addGrade(88);
        student3.addGrade(76);
        student3.addGrade(87);

        Student student4 = new Student();
        student4.setStudentName("Lurati");
        student4.addGrade(58);
        student4.addGrade(76);
        student4.addGrade(100);

        HashMap<String, Student> students = new HashMap<>();
        students.put("CptStryder", student1);
        students.put("BlazeHado", student2);
        students.put("DeathLink",student3);
        students.put("NotxGordonxShepard",student4);



    }

}
