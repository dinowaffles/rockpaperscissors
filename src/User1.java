import java.util.Scanner;

public class User1 extends Player {

    private Scanner input;

    public void User() {
        input = new Scanner(System.in);
    }

    @Override
    public void Choice() {
        System.out.println("Player 1: Type 'r' to choose rock, type 'p' to choose paper, or type 's' to choose scissors.");
        setChoice(input.nextLine().toLowerCase());
    }
}
