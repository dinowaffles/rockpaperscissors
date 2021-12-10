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
        try {
            if (mainQuestion.equalsIgnoreCase("play")) {
                newGame();
            } else if (mainQuestion.equalsIgnoreCase("history")) {
                viewHistory();
            } else if (mainQuestion.equalsIgnoreCase("quit")) {
                quitGame();
            } else {
                System.out.println("Please type 'play', 'history', or 'quit'.");
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    private static void newGame() throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.printf("Do you want to play against the computer or another person? %n");
        System.out.printf("A. Type 'computer' if you want to play against the computer. %n");
        System.out.printf("B. Type 'human' if you want to play against another person. %n");
        String playerQuestion = in.next();
            if (playerQuestion.equalsIgnoreCase("computer")) {
                computerGame();
                System.out.printf("Type 'main' to return to the main menu. %n");
                String returnToMain = in.next();
                try {
                    if (returnToMain.equalsIgnoreCase("main")) {
                        mainMenu();
                    }
                } catch (IOException e) {
                    System.out.println("Error");
                }
            } else if (playerQuestion.equalsIgnoreCase("human")) {
                humanGame();
                System.out.printf("Type 'main' to return to the main menu. %n");
                String returnToMain = in.next();
                try {
                    if (returnToMain.equalsIgnoreCase("main")) {
                        mainMenu();
                    }
                } catch (IOException e) {
                    System.out.println("Error");
                }
            } else {
                System.out.println("Please type 'computer' or 'human'.");
            }
    }

    public static void computerGame() throws IOException {
        gameStart = true;
        player1 = new User1();
        computer = new Computer();
        player1.Choice();
        computer.Choice();
        if (player1.getChoice().equals("r") && computer.getChoice().equals("r")) {
            String result1 = "It's a draw! Both chose rock.";
            System.out.println(result1);
            History.writeFile("history.txt", result1);
        } else if (player1.getChoice().equals("r") && computer.getChoice().equals("p")) {
            String result2 = "Computer wins! Computer chose paper, and Player chose rock.";
            System.out.println(result2);
            History.writeFile("history.txt", result2);
        } else if (player1.getChoice().equals("r") && computer.getChoice().equals("s")) {
            String result3 = "Player wins! Player chose rock, and Computer chose scissors.";
            System.out.println(result3);
            History.writeFile("history.txt", result3);
        } else if (player1.getChoice().equals("p") && computer.getChoice().equals("p")) {
            String result4 = "It's a draw! Both chose paper.";
            System.out.println(result4);
            History.writeFile("history.txt", result4);
        } else if (player1.getChoice().equals("p") && computer.getChoice().equals("r")) {
            String result5 = "Player wins! Player chose paper, and Computer chose rock.";
            System.out.println(result5);
            History.writeFile("history.txt", result5);
        } else if (player1.getChoice().equals("p") && computer.getChoice().equals("s")) {
            String result6 = "Computer wins! Computer chose scissors, and Player chose paper.";
            System.out.println(result6);
            History.writeFile("history.txt", result6);
        } else if (player1.getChoice().equals("s") && computer.getChoice().equals("s")) {
            String result7 = "It's a draw! Both chose scissors.";
            System.out.println(result7);
            History.writeFile("history.txt", result7);
        } else if (player1.getChoice().equals("s") && computer.getChoice().equals("r")) {
            String result8 = "Computer wins! Computer chose rock, and Player chose scissors;";
            System.out.println(result8);
            History.writeFile("history.txt", result8);
        } else {
            String result9 = "Player wins! Player chose scissors, and Computer chose paper.";
            System.out.println(result9);
            History.writeFile("history.txt", result9);
        }
    }

    public static void humanGame() throws IOException {
        gameStart = true;
        player1 = new User1();
        player2 = new User2();
        player1.Choice();
        player2.Choice();
        if (player1.getChoice().equals("r") && player2.getChoice().equals("r")) {
            String result1 = "It's a draw! Both chose rock.";
            System.out.println(result1);
            History.writeFile("history.txt", result1);
        } else if (player1.getChoice().equals("r") && player2.getChoice().equals("p")) {
            String result2 = "Player2 wins! Player2 chose paper, and Player1 chose rock.";
            System.out.println(result2);
            History.writeFile("history.txt", result2);
        } else if (player1.getChoice().equals("r") && player2.getChoice().equals("s")) {
            String result3 = "Player1 wins! Player1 chose rock, and Player2 chose scissors.";
            System.out.println(result3);
            History.writeFile("history.txt", result3);
        } else if (player1.getChoice().equals("p") && player2.getChoice().equals("p")) {
            String result4 = "It's a draw! Both chose paper.";
            System.out.println(result4);
            History.writeFile("history.txt", result4);
        } else if (player1.getChoice().equals("p") && player2.getChoice().equals("r")) {
            String result5 = "Player1 wins! Player1 chose paper, and Player2 chose rock.";
            System.out.println(result5);
            History.writeFile("history.txt", result5);
        } else if (player1.getChoice().equals("p") && player2.getChoice().equals("s")) {
            String result6 = "Player2 wins! Player2 chose scissors, and Player1 chose paper.";
            System.out.println(result6);
            History.writeFile("history.txt", result6);
        } else if (player1.getChoice().equals("s") && player2.getChoice().equals("s")) {
            String result7 = "It's a draw! Both chose scissors.";
            System.out.println(result7);
            History.writeFile("history.txt", result7);
        } else if (player1.getChoice().equals("s") && player2.getChoice().equals("r")) {
            String result8 = "Player2 wins! Player2 chose rock, and Player1 chose scissors;";
            System.out.println(result8);
            History.writeFile("history.txt", result8);
        } else {
            String result9 = "Player1 wins! Player1 chose scissors, and Player2 chose paper.";
            System.out.println(result9);
            History.writeFile("history.txt", result9);
        }
    }

    public static void viewHistory() throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println(History.gameHistory);
        System.out.printf("Type 'main' to return to the main menu. %n");
        String returnToMain = in.next();
        try {
            if (returnToMain.equalsIgnoreCase("main")) {
                mainMenu();
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
    }


    public static void quitGame() throws IOException {
        gameStart = false;
        Runtime.getRuntime().exec("clear");
    }

}
