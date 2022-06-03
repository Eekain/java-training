package inheritancemethods.cars;

public class Jeep extends Car {
    double fuelRate;
    double fuel;
    double tankCapacity;
    double extraCapacity;
    double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    public void modifyFuelAmount(double fuel) {
        super.modifyFuelAmount(fuel);
    } // örökölt metódus az ősosztályból, nem kell felülírni

    @Override
    public void drive(int km) {
        System.out.println(super.getFuelRate());
        double consumption = km * super.getFuelRate() / 100;
        System.out.println(consumption);
        setFuel((getFuel() + getExtraFuel()) - consumption + 30);
        setExtraFuel(0);

    } // csökkenti az üzemanyag mennyiségét, nem fogyhat ki!

    @Override
    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public void setExtraCapacity(double extraCapacity) {
        this.extraCapacity = extraCapacity;
    }

    public void setExtraFuel(double extraFuel) {
        this.extraFuel = extraFuel;
    }

    public double calculateRefillAmount() {
        return super.calculateRefillAmount() + (extraCapacity - extraFuel);
    } //kiszámolja, mennyit lehet tankolni

    public double getExtraFuel() {
        return extraFuel;
    }


    private boolean fuelCheck(double fuel, double extraFuel, double fuelLoss) {
        return (fuel + extraFuel) - fuelLoss >= 0;
    }

}
