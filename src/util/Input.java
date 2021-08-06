package util;
import java.util.Scanner;

public class Input {

    private Scanner userInput;

    public Input(){
        this.userInput = new Scanner(System.in);
    }

    public String getString(){
        String input = userInput.nextLine();
        return input;
    }

    public boolean yesNo(){
        System.out.println("Yes or No?");
        String input = userInput.nextLine();
        return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y");
    }
}
