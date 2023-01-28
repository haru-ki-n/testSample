package loadCsvTest;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.StringTokenizer;

class loadCsvTest {
    public static void main(String[] args) {
        
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(".", "mailList.csv"))) {
            String line = "";
            while ((line = reader.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, ",",false);
                try (BufferedWriter writer = Files.newBufferedWriter(
                    Paths.get(".","mailList.txt"), StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND)){
                    writer.write(st.nextToken() + "@mail.com" + " : " +st.nextToken());
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}