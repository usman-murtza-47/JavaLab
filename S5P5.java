import java.io.FileReader;
import java.io.IOException;
public class S5P5 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("input.txt");
        } 
        catch (IOException e) {
            System.out.println("File not found");
        } 
    }
}
