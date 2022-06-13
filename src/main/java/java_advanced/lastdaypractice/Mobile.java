package java_advanced.lastdaypractice;

import lombok.Data;

@Data
public class Mobile extends Device{

    @Override
    public String toString() {
        return "\n" +
            "Mobile{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
