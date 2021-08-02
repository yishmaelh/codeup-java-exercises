import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        double pi = 3.14159;
        String piEstimate = "The value of pi is approximately: ";
        System.out.printf("%s %.2f", piEstimate, pi);

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n" + "Enter a number: ");
        int userInt = scanner.nextInt();
        System.out.print("You entered: " + "" + userInt + "\n");


        System.out.print("Enter three different words:");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.printf("You entered: \n %s\n %s\n %s \n", firstWord, secondWord, thirdWord);

        System.out.print("Type a sentence!");
        String inputtedSentence = scanner.nextLine() + " ";
        inputtedSentence = scanner.nextLine() + " ";
//        inputtedSentence += scanner.next() + " ";
//        inputtedSentence += scanner.next();

        System.out.printf("Here is your sentence: \n %s", inputtedSentence);

        System.out.print("\n" + "What is the length of the codeup classroom.");
        int length = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter the width of the classroom.\n");
        int width = Integer.parseInt(scanner.nextLine());

        int area = length * width;
        int perimeter = (length * 2) + (width * 2);

        System.out.printf("The area is: %d\n", area);
        System.out.printf("The perimeter is: %d\n", perimeter);


    }


}
