package java_advanced.files;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class FilesDemo {

    public static void main(String[] args) {
        var path = Path.of("name_subject.csv");

        //a bufferedreader nem streames, de legalább gyorsabb, mint a sima read
        try (var reader = Files.newBufferedReader(path);
             var outputStream = Files.newOutputStream(Path.of("bytes.dat"))
            ) {
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
                byte[] bytes = line.getBytes();
                for(var b: bytes){
                    outputStream.write(b+1);
                }

            }
        } catch (IOException ioe) {
            log.error("Cannot read file", ioe);
        }





    }
}
