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

    public int getInt(){
        return userInput.nextInt();
    }

    public double getDouble( double low, double high){
        System.out.print("Please enter  number between " + low + " and " + high);
        int input = userInput.nextInt();
        if (input >= low && input <= high){
            return input;
        } else {
            getDouble(low, high);
            return input;
        }
    }
}
