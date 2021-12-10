import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class History {

    private class GameHistory {
        private String winner;
        public void setWinner(String winner) {this.winner = winner; }
        public String getWinner() {return winner; }
    }

    static List<GameHistory> gameHistory = new ArrayList<>();

    public static void writeFile(String fileName, String whoWon) throws IOException {
        File file = new File(fileName);
        BufferedWriter writer = new BufferedWriter(new FileWriter("history.txt", true));
        writer.write(whoWon);
        writer.newLine();
        writer.close();
    }

    public void readFile(String fileName, ArrayList<String> gameHistory) throws IOException {
        File file = new File(fileName);
        BufferedReader reader = new BufferedReader(new FileReader("history.txt"));
        GameHistory game = new GameHistory();
        String history = reader.readLine();
        System.out.println(history);
        try {
            game.setWinner(history);
            gameHistory.add(String.valueOf(game));
            history = reader.readLine();
        } finally {
            reader.close();
        }
    }

}
