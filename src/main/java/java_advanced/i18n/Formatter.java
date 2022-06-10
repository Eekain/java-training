package java_advanced.i18n;

import java.text.MessageFormat;
import java.util.Locale;

public class Formatter {
    public static void main(String[] args) {
        MessageFormat messageFormat = new MessageFormat("A {0} fizetése {1,number,000,000.00}", new Locale("en", "US"));
        System.out.println(messageFormat.format(new Object[]{"John Doe", 100_000.12345}));
    }
}
