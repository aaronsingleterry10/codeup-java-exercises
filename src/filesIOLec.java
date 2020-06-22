import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class filesIOLec {
    public static void main(String[] args) {
        Path file = Paths.get(".gitignore");
        System.out.println(Files.exists(file));

        String directory = "test";
        Path myDirectory = Paths.get(directory);
        if(Files.notExists(myDirectory)) {
            try {
                Files.createDirectory(myDirectory);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String txtFile = "hello1";
        Path myTxtFile = Paths.get(directory, txtFile);
        if(Files.notExists(myTxtFile)) {
            try {
                Files.createFile(myTxtFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
