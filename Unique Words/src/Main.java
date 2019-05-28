import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        //Reads the file and puts lines into String then the lines into an Array list
        ArrayList<String[]> lines = new ArrayList<>();
        //lines = [1 sentence [word1, word2], 2 sentence [word1, word2]]
        FileReader fr = new FileReader("illiad.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line.split(" "));
        }
        br.close();

        //Adding the individual words into a Linked Hash Set
        ArrayList<String> stringArrayList = new ArrayList<>();
        LinkedHashSet<Word> uniqueWord = new LinkedHashSet<>();
        // get the String[] from the array list, get the string from String[]
        // make it an object of the word class
        for(int i = 0; i < lines.size(); i++) {
            for(int y = 0; y <  lines.get(i).length; y++){
                uniqueWord.add(new Word( lines.get(i)[y]));
            }
        }

        Iterator<Word> wordIterator = uniqueWord.iterator();
        while(wordIterator.hasNext()){
            System.out.println(wordIterator.next());
        }

    }

}
