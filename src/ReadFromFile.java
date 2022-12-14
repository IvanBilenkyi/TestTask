import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Class to provide method(s) to open text file with test data and parse its content to array of string
 */
public class ReadFromFile {

    String textFromFile = "";
    String[] textFromFileSplittedBySpace;

    public String[] OpenInputFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        // Copy text from file to string variable
        while (scanner.hasNextLine()) {
            textFromFile = textFromFile + "\n" + scanner.nextLine();
        }
        scanner.close();

        // Remove extra punctuation
        textFromFile = textFromFile.replace("\n"," ");
        textFromFile = textFromFile.replace(","," ");
        textFromFile = textFromFile.replace("."," ");
        textFromFile = textFromFile.replace("  "," ");
        textFromFileSplittedBySpace = textFromFile.split(" ");
        return textFromFileSplittedBySpace;
    }
}
