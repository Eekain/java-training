package intro;

public class TrainerMain {
    public static void main(String[] args) {
        Trainer john = new Trainer();
        john.name = "Johhny Do";
        john.yearOfBirth = 1980;

        System.out.println(john.name);
        System.out.println(john.yearOfBirth);

        Trainer jack = new Trainer();
        jack.name = "Jack Doehs2";
        jack.yearOfBirth = 1990;
        System.out.printf("%s year of birth is: %d\n", jack.name, jack.yearOfBirth);

        Trainer rando = new Trainer();
        System.out.println("\n" + rando.name + "\n" + rando.yearOfBirth);

        System.out.println(rando);

    }
}
