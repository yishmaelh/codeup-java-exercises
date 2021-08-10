import java.util.Random;
public class ServerNameGenerator {

public static void main(String[] args) {
    String[] nouns = {"Robot", "Bugle", "Stargazer", "Jupiter", "Stranger", "Pizza", "Turbine", "Sword", "Lemon", " Turntable"};

    String[] adjectives = {"Racy", "Burning", "Daring", "Proud", "Misty", "Bashful", "Trusting", "Talented", "Vigorous", "Brave"};
    System.out.println("Here is your server name: ");
    System.out.println(randomElement(adjectives) + "-" + randomElement(nouns));

}

    public static String randomElement(String[] input){
        Random rand = new Random();
        int random = rand.nextInt(input.length);
        return input[random];
    }





}

