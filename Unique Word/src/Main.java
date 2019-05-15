import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        FileReader fr = new FileReader("illiad.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            //System.out.println(line);
            lines.add(line);
        }
        br.close();
        System.out.println(lines.get(3));

        TreeSet<String> texts = new TreeSet<>();
        for(int i = 0; i <10; i++){
            
        }
    }
}

