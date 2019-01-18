import com.sun.javafx.binding.StringFormatter;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        FileReader fr = new FileReader("in.text");
        BufferedReader br = new BufferedReader(fr);
        String line;

        //1. Copy each line into its own element of an ArrayList
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            lines.add(line);
        }

        br.close();


        System.out.println(findWord("1880s",lines));
    }

    //2. Create a method that can search for a word in the entire text, return every index position of the arraylist that the word is in and where you find it in a sentence.
    public static int findWord(String word, ArrayList linestoCheck) throws IOException {
        ArrayList<String> lines = linestoCheck;
        int pos = -1;
        for(int k = 0;k < lines.size();k++){
            String Sentence = lines.get(k);
            if (Sentence.contains(word)) {
                pos = k;
                break;
            }
        }
        return pos;
    }
}


