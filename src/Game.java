import java.io.IOException;
import java.util.Scanner;

public class Game {
    private static User1 player1;
    private static User2 player2;
    private static Computer computer;
    private static boolean gameStart = false;


    public static void mainMenu() throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.printf("MAIN MENU %n");
        System.out.printf("1. Type 'play' if you want to play a new game. %n");
        System.out.printf("2. Type 'history' if you want to view past games. %n");
        System.out.printf("3. Type 'quit' to stop playing %n");
        String mainQuestion = in.next();
        if (mainQuestion.equalsIgnoreCase("play")) {
            newGame();
        } else if (mainQuestion.equalsIgnoreCase("history")) {
            viewHistory();
        } else if (mainQuestion.equalsIgnoreCase("quit")){
            quitGame();
        } else {
            System.out.println("Please type 'play', 'history', or 'quit'.");
        }
    }

    private static void newGame() {
        Scanner in = new Scanner(System.in);
        System.out.printf("Do you want to play against the computer or another person? %n");
        System.out.printf("A. Type 'computer' if you want to play against the computer. %n");
        System.out.printf("B. Type 'human' if you want to play against another person. %n");
        String playerQuestion = in.next();
        if (playerQuestion.equalsIgnoreCase("computer")) {
            computerGame();
        } else if (playerQuestion.equalsIgnoreCase("human")){
            humanGame();
        } else {
            System.out.println("Please type 'computer' or 'human'.");
        }
    }

    public static void computerGame() {
        gameStart = true;
        player1 = new User1();
        computer = new Computer();
        player1.Choice();
        computer.Choice();
        if (player1.getChoice().equals("r") && computer.getChoice().equals("r")) {
            System.out.println("It's a draw! Both chose rock.");
        } else if (player1.getChoice().equals("r") && computer.getChoice().equals("p")) {
            System.out.println("Computer wins! Computer chose paper, and Player chose rock.");
        } else if (player1.getChoice().equals("r") && computer.getChoice().equals("s")) {
            System.out.println("Player wins! Player chose rock, and Computer chose scissors.");
        } else if (player1.getChoice().equals("p") && computer.getChoice().equals("p")) {
            System.out.println("It's a draw! Both chose paper.");
        } else if (player1.getChoice().equals("p") && computer.getChoice().equals("r")) {
            System.out.println("Player wins! Player chose paper, and Computer chose rock.");
        } else if (player1.getChoice().equals("p") && computer.getChoice().equals("s")) {
            System.out.println("Computer wins! Computer chose scissors, and Player chose paper.");
        } else if (player1.getChoice().equals("s") && computer.getChoice().equals("s")) {
            System.out.println("It's a draw! Both chose scissors.");
        } else if (player1.getChoice().equals("s") && computer.getChoice().equals("r")) {
            System.out.println("Computer wins! Computer chose rock, and Player chose scissors;");
        } else {
            System.out.println("Player wins! Player chose scissors, and Computer chose paper.");
        }
    }

    public static void humanGame() {
        gameStart = true;
        player1 = new User1();
        player2 = new User2();
        player1.Choice();

    }

    public static void viewHistory() {
        System.out.println(History.gameHistory);
    }

    public static void quitGame() throws IOException {
        gameStart = false;
        Runtime.getRuntime().exec("clear");
    }

}
