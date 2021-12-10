import java.util.Scanner;

public class Game {

    public static void playGame() {
        Scanner in = new Scanner(System.in);
        System.out.printf("MAIN MENU %n");
        System.out.printf("1. Do you want to play against the computer or another user? %n");
        System.out.printf("a. Type 'computer' if you want to play against the computer. %n");
        System.out.printf("b. Type 'human' if you want to play against another user. %n");
        System.out.printf("2. Type 'history' if you want to view past games. %n");
        System.out.printf("3. Type 'quit' to stop playing %n");
    }

}
