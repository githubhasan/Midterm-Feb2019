package string.problems;

import java.util.*;

public class DuplicateWord {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        String text = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        List <String> list = Arrays.asList(text.split(" "));

        Set <String> uniqueWords = new HashSet <String>(list);
        for (String word : uniqueWords) {
            System.out.println(word + ": " + Collections.frequency(list, word));
        }
    }
}