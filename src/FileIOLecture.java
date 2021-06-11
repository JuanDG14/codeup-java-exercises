import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FileIOLecture {

    public void readFileAndOutput (Path pathToFile){
        List<String> currentList = new ArrayList<>();
        try {
            currentList = Files.readAllLines(pathToFile);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
        for (String line : currentList){
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
//        Path path = Paths.get("src");
//        System.out.println(path);
//        System.out.println(path.toAbsolutePath());

//        Path path = Paths.get("src", "FileIOLecture");
//        System.out.println(path);
//        System.out.println(path.toAbsolutePath());

//        Path pathToSrc = Paths.get("src");
//        System.out.println(pathToSrc);
//        Path thisWontWork = Paths.get(pathToSrc, "FileIOLecture.java");
//        Path thisWillWork = Paths.get(String.valueOf(pathToSrc), "FileIOLecture.java");
//        System.out.println(thisWillWork);

//
        Path toOurDataPlace = Paths.get("src/data");
//        System.out.println(toOurDataPlace);
        Path toOurDataFile = Paths.get(String.valueOf(toOurDataPlace), "data.txt");

//        try{
//            if (Files.notExists(toOurDataPlace)){
//                Files.createDirectories(toOurDataPlace);
//            }else{
//                System.out.println("The " + toOurDataPlace + " directory already exists");
//            }
//        } catch (IOException ioe){
//            ioe.printStackTrace();
//        }

//        try{
//            Files.createFile(toOurDataFile);
//        }catch (IOException ioe){
//            ioe.printStackTrace();
//        }

        // Write to a file

        List<String> animeCharacters = Arrays.asList("Naruto", "Meliodas", "Ban", "Netsuko", "Tanjiro");

        try{
            Files.write(toOurDataFile, animeCharacters);
        }catch(IOException ioe){
            ioe.printStackTrace();
        }

        List<String> currentList = new ArrayList<>();

//        // read the information from the file
        try {
            currentList = Files.readAllLines(toOurDataFile);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }

        // loop through the ArrayList and output each item
        for (String line: currentList) {
            System.out.println(line);
        }

        FileIOLecture io = new FileIOLecture();
        io.readFileAndOutput(toOurDataFile);

        List<String> lateRomanEmpresses = new ArrayList<>();
        lateRomanEmpresses.add("Galla Placidia");
        lateRomanEmpresses.add("Theodora");
        lateRomanEmpresses.add("Licinia Eudoxia");

        try {
            Files.write(toOurDataFile, lateRomanEmpresses, StandardOpenOption.APPEND);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }

        io.readFileAndOuput(toOurDataFile);

    }

    private void readFileAndOuput(Path toOurDataFile) {

    }
}
