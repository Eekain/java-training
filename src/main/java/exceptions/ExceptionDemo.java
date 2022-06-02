package exceptions;

public class ExceptionDemo {
    private  String name;



    public static void main(String[] args) {
        String input = "yxz";
        //int number = Integer.parseInt(input);
        //System.out.println(number);
        new ExceptionDemo().getName().toUpperCase().substring(1,10);
    }

    public String getName() {
        return name;
    }
}
