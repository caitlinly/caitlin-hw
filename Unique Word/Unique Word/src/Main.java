import sun.reflect.generics.tree.Tree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        ArrayList<Word> lines = new ArrayList<>();
        FileReader fr = new FileReader("illiad.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(new Word(line));

        }
        br.close();

        LinkedHashSet<Word> wordSet = new LinkedHashSet<>();
        for(int i = 0; i < lines.size(); i++){
            wordSet.add(lines.get(i));
        }
        Iterator<Word> wordIterator = wordSet.iterator();
        while(wordIterator.hasNext()){
            System.out.println(wordIterator.next());
        }


    }

}

