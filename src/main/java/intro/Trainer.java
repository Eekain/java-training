package intro;

public class Trainer {

    private String name= "Anonymous";
    private int yearOfBirth= 1900;

    public Trainer(String name, int yearOfBirth) {
        System.out.println("Construct trainer");
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public Trainer() {
        //that's polymorphism for ye. Was too lazy to correct TrainerMain
        //edgy little lazeball am I
    }


    public int getAge(int currentYear){
        return currentYear - yearOfBirth;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getNameAndYearOfBirth(){
        return String.format("%s: %d ", name, yearOfBirth);
    }
}
