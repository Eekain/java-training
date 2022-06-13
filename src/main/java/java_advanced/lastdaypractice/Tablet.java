package java_advanced.lastdaypractice;
import lombok.Data;

@Data
public class Tablet extends Device {

    @Override
    public String toString() {
        return "\n"+
                "Tablet{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price='" + price + '\'' +
                '}'
                ;
    }
}

