import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class History {

    private class GameHistory {
        private String winner;
        public void setWinner(String winner) {this.winner = winner; }
        public String getWinner() {return winner; }
    }

    public static void writeFile(String fileName, String whoWon) throws IOException {
        File file = new File(fileName);
        BufferedWriter writer = new BufferedWriter(new FileWriter("history.txt", true));
        writer.write(whoWon);
        writer.newLine();
        writer.close();
    }

    static List<GameHistory> gameHistory = new ArrayList<>();

    public void readFile(String fileName, ArrayList<String> gameHistory) throws IOException {
        File file = new File(fileName);
        BufferedReader reader = new BufferedReader(new FileReader("history.txt"));
        GameHistory game = new GameHistory();
        String history = reader.readLine();
        System.out.println(history);
        try {
            game.setWinner(history);
            System.out.println(history);
            gameHistory.add(String.valueOf(game));
            System.out.println(history);
            history = reader.readLine();
            System.out.println(history);
        } finally {
            reader.close();
        }
    }

}
