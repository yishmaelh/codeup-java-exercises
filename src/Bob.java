import java.util.Scanner;


public class Bob {

    public static void main (String[] args){
    Scanner userInput = new Scanner(System.in);

    System.out.print("Please say something to Bob. He is a little on the shy side, so take it easy on him!");

        String question = userInput.nextLine();
        if (question.endsWith("!")){
            System.out.println("Whoa, chill out!");
        } else if (question.endsWith("?")){
            System.out.println("Sure.");
        } else if (question.equals("")){
            System.out.print("Fine. Be that way!");
        } else {System.out.println("Whatever."); }

    }
}
