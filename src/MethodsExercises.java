import java.util.Scanner;

public class MethodsExercises {

    public static double add(double x, double y) {
        return x + y;

    }


    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiple(double number1, double number2) {
        return number1 * number2;
    }

    public static double divide(double h, double i) {
        return h / i;
    }

    public static double modulus(double x, double y) {
        return x % y;
    }

    public static int getInput(int low, int high) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a number between 1 and 10.");
        int userInput = sc.nextInt();
        if (userInput >= low & userInput <= high) {
            System.out.println("Your number is in range!");
        } else {
            System.out.println("You are out of range.");
            getInput(1, 10);

        }

        return userInput;
    }

    public static void main (String[] args) {

        System.out.println(add(6, 7));
        System.out.println(subtract( 10, 8));
        System.out.println(multiple(5, 20));
        System.out.println(divide( 25, 5));
        System.out.println(modulus(100, 10));

        System.out.print(getInput(1,10));

    }



}
