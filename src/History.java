import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class History {

    public static void writeFile(String fileName, String winner) throws IOException {
        File file = new File(fileName);
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(winner + "won this round!");
        writer.close();
    }
}
