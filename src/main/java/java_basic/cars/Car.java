package java_basic.cars;
//based on tests and built wrong. in the kiegJegyzet you can find the readme.md which shows the basis this was built on - maybe create it better next time
public class Car {
    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        if(fuel>tankCapacity){
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        } else {
            this.fuelRate = fuelRate;
            this.fuel = fuel;
            this.tankCapacity = tankCapacity;
        }

    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void modifyFuelAmount(double fuelBy){

        if(fuelBy + this.fuel >= 0 && fuelBy + this.fuel <= tankCapacity){
            this.fuel += fuelBy;
        } else {
            throw new IllegalArgumentException("Not enough fuel available!");
        }
    }
    public void drive(int km){
        double consumed = km/100 * fuelRate;
        modifyFuelAmount(consumed);


    } // csökkenti az üzemanyag mennyiségét, nem fogyhat ki!
    public double calculateRefillAmount(){
        return tankCapacity-fuel;
    } //kiszámolja, mennyit lehet tankolni

    private boolean fuelCheck(double fuel, double fuelLoss) {
        return fuel - fuelLoss >= 0;
    }

    public double getFuel() {
        return fuel;
    }

    public double getFuelRate() {
        return fuelRate;
    }
}
