package todopractice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Todos {
    List<Todo> tlis = new ArrayList<>();


    public Todos() {

    }

    public Todos addTodo(String task){
        tlis.add(new Todo(task));
        return this;
    } // completed false


    public void addTodos(String task, String... tasks){ //LEGALÁBB EGY kötelező
        addTodo(task);
        for(var taskToAdd: tasks){
            addTodo(taskToAdd);
        }
    }
    public void complete(String task){
        boolean found = false;
        for(Todo t: tlis){
            if(t.getTask().equals(task)){
                found = true;
                t.complete();
            }
        }
        if(!found){
            throw new TodoNotFoundException("Can not find todo with task: " + task, task);
        }
    }
    public void writeTo(Path path){
        List<String> texts = toLines();
        writeToFile(path, texts);
    } // a todo-kat fogja kiírni a megadott helyre, ha a todo még nincs elvégezve: "[ ] Kenyeret venni", ha elvégzett "[x] Tankolni"

    private void writeToFile(Path path, List<String> texts) {
        try {
            Files.write(Paths.get("TODO.txt"), texts);
        } catch (IOException e) {
            throw new IllegalStateException("Can not write file " + path, e);
        }
    }

    private List<String> toLines() {
        List<String> texts = new ArrayList<>();
        for(Todo t: tlis){
            texts.add("["+ (t.isCompleted() ? "X" : " ") + "] "+ t.getTask());
        }
        System.out.println(texts);
        return texts;
    }


}
