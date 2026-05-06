import java.io.*;

public class FileReadDemo {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(f);
            System.out.println(br.readLine());
            br.close();
        } catch (Exception e) {
            System.out.println("File not found");
        } finally {
            System.out.println("Closing file...");
        }
    }
}
