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
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(whoWon);
        writer.close();
    }

    public void readFile(String fileName) throws IOException {
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("/src/history.txt"));
            String history = reader.readLine();
            while (history != null ) {
                GameHistory game = new GameHistory();
                game.setWinner(history);
                gameHistory.add(game);
                history = reader.readLine();
            }
        } finally {
            assert reader != null;
            reader.close();
        }
    }

}
