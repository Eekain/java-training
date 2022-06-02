package cities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
//mockaroo.com segítségével
public class FileMain {
    public static void main(String[] args) {
        try{
            List<String> names = Files.readAllLines(Paths.get("names.txt")); //egyszerre betölti, így nagy fájlnál túl sok lehet a memória
            System.out.println(names);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
