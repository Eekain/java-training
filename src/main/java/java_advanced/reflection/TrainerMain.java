package java_advanced.reflection;

import java.lang.reflect.Method;

public class TrainerMain {

    public static void main(String[] args) {
        Class<Trainer> clazs = Trainer.class;
        Method[] methods = clazs.getMethods();

        for(Method m : methods){
            System.out.println(m.getName());

        }
        System.out.println(Trainer.class.getCanonicalName());



    }
}
