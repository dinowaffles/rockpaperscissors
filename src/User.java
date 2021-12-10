import java.util.Scanner;

public class User extends Player {

    private Scanner input;

    public User() {
        input = new Scanner(System.in);
    }

    @Override
    public void Choice() {
        System.out.println("Type 'rock', 'paper', or 'scissors' to play.");
        setChoice(input.nextLine().toLowerCase());
    }
}
