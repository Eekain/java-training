package intro;

public class TrainerMain {
    public static void main(String[] args) {
        Trainer john = new Trainer();
        john.setName("Johhny Do");
        john.setYearOfBirth(1980);

        System.out.println(john.getName());
        System.out.println(john.getYearOfBirth());
        System.out.println(john.getAge(2022));
        Trainer jack = new Trainer();
        jack.setName("Jack Doehs2");
        jack.setYearOfBirth(1990);
        System.out.printf("\u001B[31m%s year of birth is: %d, and age: %d\n\u001B[0m", jack.getName(), jack.getYearOfBirth(), jack.getAge(2022));

        Trainer rando = new Trainer();
        System.out.println("\n" + "\u001B[32m" + rando.getName() + "\n" + rando.getYearOfBirth() + "\u001B[0m");

        System.out.println(rando.getNameAndYearOfBirth());

    }
}
