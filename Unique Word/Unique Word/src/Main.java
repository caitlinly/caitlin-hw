import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        //Reads file, and makes each line into a String[]. Adds each String[] into an array list
        ArrayList<String[]> lines = new ArrayList<>();
        //lines = []sentence1 [word1, word2], sentence2 [word1, word2]]
        FileReader fr = new FileReader("illiad.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line.split(" "));
        }
        br.close();

        //Adding the individual words into a linked has set
        LinkedHashSet<Word> uniqueWord = new LinkedHashSet<>();
        //get the String[] from the arraylist
        for(int i = 0; i < lines.size(); i++){
            //get the string from the String[]
            for(int y = 0; y < lines.get(i).length; y++) {
                uniqueWord.add(new Word(lines.get(i)[y]));
            }
        }
        Iterator<Word> wordIterator = uniqueWord.iterator();
        while(wordIterator.hasNext()){
            System.out.println(wordIterator.next());
        }


    }

}

