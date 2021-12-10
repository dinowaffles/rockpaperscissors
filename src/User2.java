import java.util.Scanner;

public class User2 extends Player{

    private Scanner input;

    public void User() {
        input = new Scanner(System.in);
    }

    @Override
    public void Choice() {
        System.out.println("Player 2: Type 'r' to choose rock, type 'p' to choose paper, or type 's' to choose scissors.");
        setChoice(input.nextLine().toLowerCase());
    }
}
