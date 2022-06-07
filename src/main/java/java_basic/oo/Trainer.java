package java_basic.oo;

public class Trainer {
    Trainer(String name){
        System.out.println(name);;
    }

    //overloading úgy működik, ha különböző számú és/vagy típusú argumentumokat kér be

    public static void main(String[] args) {
        //nem fordul le: Trainer trainer = new Trainer();
        var trainer = new Trainer("John Doe");
    }
}
