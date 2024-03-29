package util;
import java.util.Scanner;

public class Input {

    private Scanner userInput;

    public Input(){
        this.userInput = new Scanner(System.in);
    }

    public String getString(){
//        System.out.println("Type something");
        String input = userInput.nextLine();
        return input;
    }

    public boolean yesNo(){
        System.out.println("Yes or No?");
        String input = userInput.nextLine();
        return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y");
    }

    public int getInt(){
        System.out.println("Enter an integer");
        String intString = getString();
        try{
           return Integer.valueOf(intString);
        } catch(NumberFormatException e){
            System.out.println("Not an integer, please try again");
        }
        return getInt();

    }

    public double getDouble( double low, double high){
        System.out.println("Enter a double between " + low + " and " + high );
        String doubleString = getString();
        try{
            double testDouble = Double.valueOf(doubleString);
            if (testDouble >= low && testDouble <= high){
                return testDouble;
            }
        } catch(NumberFormatException e){
            System.out.println("Not a double, give it another try");
        }
        return getDouble(1,10);

    }

    public double getDouble(){
        System.out.println("Please enter a decimal");
        return userInput.nextDouble();
    }

    public int getInt(int min, int max){
        System.out.println("Enter an integer between " + min + " and " + max);
        String intString = getString();
        try{
            int testInt = Integer.valueOf(intString);
            if (testInt >= min && testInt <= max){
                return testInt;
            }
        } catch(NumberFormatException e){
            System.out.println("Not an integer, please try again");
        }
        return getInt(1, 100);

    }


}

