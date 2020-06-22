import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FilesIOLec {
    public static void main(String[] args) throws IOException{
//        Path file = Paths.get(".gitignore");
//        System.out.println(Files.exists(file));
//
//        String directory = "test";
//        Path myDirectory = Paths.get(directory);
//        if(Files.notExists(myDirectory)) {
//            try {
//                Files.createDirectory(myDirectory);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        String txtFile = "hello1";
//        Path myTxtFile = Paths.get(directory, txtFile);
//        if(Files.notExists(myTxtFile)) {
//            try {
//                Files.createFile(myTxtFile);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        String directory = "test";
        Path myDirectory = Paths.get("test");
        if (Files.notExists(myDirectory)) {
            Files.createDirectory(myDirectory);
        }

        String file = "hello.txt";
        Path myFile = Paths.get(directory, file);
        if (Files.notExists(myFile)) {
            Files.createFile(myFile);
        }

        List<String> names = Files.readAllLines(myFile);
        List<String> addNames = Arrays.asList("Oreo");
//        Files.write(myFile, addNames, StandardOpenOption.APPEND);
//        names = Files.readAllLines(myFile);
        System.out.println(names);
    }
}
