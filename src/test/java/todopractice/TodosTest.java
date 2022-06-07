package todopractice;

import java_basic.todopractice.Todos;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TodosTest {


    @TempDir
    Path tempDir;


    @Test
    void WriteTo() throws  IOException{
        System.out.println(tempDir);
        //nekem valamiért nem találja a fájlt....

        Path file = tempDir.resolve("todos.txt");
        System.out.println(file);

        Todos todos = new Todos();
        todos.addTodo("Programot megírni");
        todos.addTodo("Első futtatás");

        todos.writeTo(file);

        assertEquals("""
                [ ] Programot megírni
                [ ] Első futtatás
                """.replace("\n", "\r\n"),Files.readString(file));


    }


}