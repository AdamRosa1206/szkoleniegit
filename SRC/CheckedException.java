import java.io.FileInputStream;
import java.io.FileNotFoundException;


// wywoływanie oczekiwanych wyjątków (typu checked)
public class CheckedException {

    public static void main(String[] args) {
        try {
            System.out.println("Before reading file");
            readFile("C:\\Users\\adamr\\OneDrive\\Pulpit\\javakurs\\SRC\\test.txt");

        } catch (FileNotFoundException e) {
            System.out.println("Wyjatek został wyrazucony");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Closing file");
        }
    }

   public static void readFile(String path) throws FileNotFoundException {
       FileInputStream fileInputStream = new FileInputStream(path);
   }
}
