package inheritancemethods.cars;

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


    public void modifyFuelAmount(double fuel){
        if(fuel + this.fuel >= 0 && fuel + this.fuel <= tankCapacity){
            this.fuel += fuel;
        } else {
            throw new IllegalArgumentException("Cannot modify fuel by the amount: " + fuel);
        }
    }
    public void drive(int km){
        double consumed = km/100 * fuelRate;
        if(fuelCheck(fuel, consumed)){
            fuel -= consumed;


        } else {
            throw new IllegalArgumentException("Not enough fuel available!");
        }


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
