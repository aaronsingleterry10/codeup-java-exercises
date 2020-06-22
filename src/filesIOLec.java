import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class filesIOLec {
    public static void main(String[] args) {
        Path file = Paths.get(".gitignore");
        System.out.println(Files.exists(file));
    }
}
