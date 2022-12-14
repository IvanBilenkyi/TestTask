// Task description:
// Write a program that: Given a text file, count occurrence of each unique word in the file.
// For example: a file containing the string “Go do that thing that you do so well”
// should find these counts: 1: Go 2: do 2: that 1: thing 1: you 1: so 1: well
// ----------------------------------------------------------------------------
// Additional Requirements were found during task analysis:
// 1. don't change/update original input data;
// 2. handle possible separating symbols: commas, dots, extra spaces;
// 3. make sure that words like "Go" and "go" are counted => 2 words "go";
// 4. handle input file with more than 1 line;
// 5. make code structure as readable as possible.
// Optional Requirements (e.g. for the next versions):
// 1. read path to file from the keyboard;
// 2. provide message 'file not found' in case of issue with the file;
// 3. make path to file OS independent (currently works for Windows only);
// 4. upgrade algorithm: stop searching for a word when it was found already before;
// 5. handle more possible separators: semicolon, tabulation, hyphen, etc.;
// 6. handle popular encoding types;
// 7. use list instead of string (or array with 2 levels)
// 8. implement choice for a user how to provide the output (save in a file or show on screen).
// ----------------------------------------------------------------------------
// Please don't hesitate to provide any feedback: ivan.bilenkyi.it@gmail.com

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
        public static void main(String[] args) throws FileNotFoundException {
                // String buffer;
                String[] buffer;

                // Step 1. Open text file with test data and parse its content to array of string
                String pathToTestFile = "C:\\Temp\\test_task_input_file.txt";
                ReadFromFile testFile = new ReadFromFile();
                buffer = testFile.OpenInputFile(pathToTestFile);

                // Step 2. Run search for each element (word) in array (buffer) and count cases
                int sizeBuffer = buffer.length;
                int[] counter = new int[sizeBuffer];
                CountWords wordsFromFile = new CountWords();
                counter = wordsFromFile.CountEachWord(buffer);

                // Step 3. Provide formatted output for
                // each unique word in BUFFER (Step 1) and with values saved in COUNTER (Step 2)
                OutputWithCounters results = new OutputWithCounters();
                results.outputWordsWithCounters(buffer, counter);


                 /* for (int i=0; i<(buffer.length); i++) {
                        // System.out.println(buffer[i]);
                        System.out.println(counter[i]);
                } */
        }
}
