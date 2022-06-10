package java_advanced.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class Messages {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle.getString("openscreen.welcome.message"));

        ResourceBundle bundlehu = ResourceBundle.getBundle("messages", new Locale("hu", "HU"));
        System.out.println(bundlehu.getString("openscreen.welcome.message"));
    }
}
