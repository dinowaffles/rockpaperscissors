import java.util.Random;

public class Computer extends Player {

    private Random random = new Random();

    @Override
    public void Choice() {
        int number = random.nextInt(3);
        if (number == 0) {
            setChoice("r");
        } else if (number == 1) {
            setChoice("p");
        } else {
            setChoice("s");
        }
    }
}
