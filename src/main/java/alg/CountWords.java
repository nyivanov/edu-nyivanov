package alg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Description:
 * Write a program to read words from a file. Count the
 * repeated or duplicated words. Sort it by maximum repeated or
 * duplicated word count.
 */
public class CountWords {
    private static Map<String, Integer> getWords(final String pFileName) throws IOException {
        final Map<String, Integer> wordsCount = new HashMap<>();
        final FileReader fileReader = new FileReader(pFileName);
        final BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(line, " ");
            while (stringTokenizer.hasMoreTokens()) {
                String token = stringTokenizer.nextToken().toLowerCase();
                wordsCount.putIfAbsent(token, 0);
                wordsCount.computeIfPresent(token, (String word, Integer count) -> count + 1);
            }
        }
        return wordsCount;
    }

    private static ArrayList<Map.Entry<String, Integer>> sortWordsByCount(final Map<String, Integer> pWords) {
        ArrayList<Map.Entry<String, Integer>> wordsByCount = new ArrayList<>(pWords.entrySet());
        wordsByCount.sort((a, b) -> b.getValue() - a.getValue());
        return wordsByCount;
    }

    public static void main(String... args) throws IOException {
        final String fileName = "C:\\Users\\nivanov\\countWords.txt"; //this file has to be present in the specified directory.
        Map<String, Integer> words = getWords(fileName);
        ArrayList<Map.Entry<String, Integer>> sortedByCount = sortWordsByCount(words);
        System.out.println(sortedByCount);
    }
}
