import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        ArrayList<String[]> lines = new ArrayList<>();
        FileReader fr = new FileReader("illiad.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line.split(" "));
        }
        br.close();

        lines.subList(i,i+1);

        LinkedHashSet<Word> uniqueWord = new LinkedHashSet<>();
        for(int i = 0; i < lines.size(); i++){
            Word w = new Word();
            uniqueWord.add(w);
        }
        Iterator<Word> wordIterator = uniqueWord.iterator();
        while(wordIterator.hasNext()){
            System.out.println(wordIterator.next());
        }


    }

}

