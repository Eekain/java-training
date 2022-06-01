package enums;

import java.util.Arrays;

public class ColorsMain {


    public static void main(String[] args) {
        Color color = Color.BLACK;
        System.out.println(Arrays.toString(color.values()));
        System.out.println(color.RED.ordinal()); // visszaadja a sorban a helyét - ez most épp a kettes

        System.out.println(color.GREEN.name());
        System.out.println(color.GREEN.toString());
        Color favourite = color.valueOf("RED");
        //Color nonExistant = color.valueOf("GREY");

        System.out.printf("%sez piros%s\n", color.RED, color.RESET);
        System.out.printf("%sez zöld%s\n", color.GREEN, color.RESET);
        System.out.printf("%sez fekete%s\n", color.BLACK, color.RESET);
    }
}
