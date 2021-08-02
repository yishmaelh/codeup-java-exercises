import java.util.Scanner;

public class ConsoleExercises {

    public static void main (String[] args) {
        double pi = 3.14159;
        String piEstimate = "The value of pi is approximately: ";
        System.out.printf("%s %.2f", piEstimate, pi);

        Scanner scanner = new Scanner(System.in);
        System.out.print(  "\n" +"Enter a number: ");
        int userInt = scanner.nextInt();
        System.out.print("You entered: " + "" + userInt + "\n");

        System.out.print("Enter three different words:");
        var firstWord = scanner.next();
        var secondWord = scanner.next();
        var thirdWord = scanner.next();
        System.out.printf("You entered: \n %s\n %s\n %s.\n", firstWord, secondWord, thirdWord);


    }


}
