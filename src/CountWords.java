/**
 * Class to provide method(s) to run search for each element (word) in array (input text)
 * and count cases of each unique element (word)
 */
public class CountWords {

    public int[] CountEachWord(String[] inputText) {

        // Let's calculate number of elements in array of input data
        int size = inputText.length;
        int tempCounter;
        int[] results = new int[size];

        // Run search + count
        for (int i=0; i<size; i++) {
            tempCounter = 1;
            for (int j=i+1; j<size; j++) {

                // Compare each taken word in first FOR to words one by one in second FOR,
                // starting from next word after taken and to the end of array
                if (inputText[i].equalsIgnoreCase(inputText[j])) {
                    tempCounter++ ;
                    inputText[j] = " ";
                }
            }
            results[i] = tempCounter;
        }
        return results;
    }
}
