package java_basic.todopractice;

import java.nio.file.Path;

public class TodoMain {
    public static void main(String[] args) {
        Todos todoList = new Todos();
        todoList.addTodo("Check fridge");
        todoList.complete("Check fridge");
        todoList.writeTo(Path.of("Todo.txt"));
        todoList.addTodos("Kenyér", "Tej");
        todoList
                .addTodo("Sültpogi")
                .addTodo("Macskaszőrpulcsi"); //ha return this a metódon belül, és nem void, akkor a fluent api-t lehet így használni rajta, hogy sorra hívod a metódusokat...


    }
}
