/**
 * Class to provide method(s) to run the output in format <counter value[i]> : <unique word[i]>
 * for all unique words in text from file (test data)
 */
public class OutputWithCounters {

    public void outputWordsWithCounters(String[] inputWords, int[] countersOfEachWord) {

        int sizeWords = inputWords.length;

        for (int i=0; i<sizeWords; i++) {

            if (!inputWords[i].equals(" ")&&!inputWords[i].equals("")) {
                System.out.println(countersOfEachWord[i] + " :  " + inputWords[i]);
            }
        }
    }
}
