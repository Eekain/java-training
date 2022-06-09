package java_advanced.indexreader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class IndexReader {
    public String findLink(String zelda){
        //System.out.println("Zelda: " + zelda);
        String s = zelda.substring(zelda.indexOf(" href=")+7);
        //System.out.println(s);
        return s.substring(0, s.indexOf('\"'));
    }
    public String getLinkWithRegexp(String line){
        Pattern pattern = Pattern.compile("href=\\\"([^\\\"]+)\\\"");
        Matcher matcher = pattern.matcher(line);
        if(matcher.find()){
            return matcher.group(1);
        } else {
            throw new IllegalArgumentException("No match");
        }
    }
    public static void main(String[] args) {
        /*
        try (var source = Files.lines(Path.of("index.htm"))){
            int count = (int) source.filter(s -> s.contains("koronavírus")).count();
            System.out.println(count);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

         */
        IndexReader ir =  new IndexReader();
        try (var source = Files.lines(Path.of("index.htm"))){
            List<String> links = source.filter(s -> s.contains("href=")).map(s -> ir.getLinkWithRegexp(s))
                    .collect(Collectors.toList())
                    ;

            links.stream()
                    .filter(s -> s.contains("/") && s.contains("://"))
                    .forEach(s -> System.out.println(s));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
