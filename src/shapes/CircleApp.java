package shapes;
import util.Input;

import javax.print.MultiDocPrintService;

public class CircleApp {

    private static int userMadeCircle = 0;
    public static void main(String[] args) {

        boolean additionalCircle;

        do {
            System.out.println("Enter your circle's radius: ");
            Input inputRadius = new Input();
            double radius = inputRadius.getDouble();
            Circle circle = new Circle(radius);
            userMadeCircle += 1;
            System.out.println("The area is: " + circle.getArea());
            System.out.println("The circumference is: " + circle.getCircumference());
            System.out.println("Would you like to create another circle?");
            Input inputForCircle = new Input();
            additionalCircle = inputForCircle.yesNo();
        } while (additionalCircle);
        System.out.println("You have created " + userMadeCircle + "circles.");

    }
}

