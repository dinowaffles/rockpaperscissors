import java.util.Scanner;

public class User2 extends Player{

    private Scanner input;

    public void User() {
        input = new Scanner(System.in);
    }

    @Override
    public void Choice() {
        Scanner input = new Scanner(System.in);
        System.out.println("Player 2: Type 'r' to choose rock, type 'p' to choose paper, or type 's' to choose scissors.");
        String user2Choice = input.nextLine().toLowerCase();
        if (user2Choice.equals("r") || user2Choice.equals("p") || user2Choice.equals("s")) {
            setChoice(user2Choice);
        } else {
            Choice();
        }
    }
}
