package java_advanced.i18n;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatDemo {
    private static final Locale HUN_LOCALE  =new Locale("hu", "HU");

    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance(HUN_LOCALE);
        nf.setMaximumFractionDigits(5);
        System.out.println(nf.format(111111111.2313214423));
        String formatted = nf.format(123124134.12314);
        System.out.println(formatted.contains(" "));
        for(char c : formatted.toCharArray()){
            System.out.println((int) c);
        }

        try {
            System.out.println(nf.parse("123\u00A0123\u00A0123123456"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }

}
