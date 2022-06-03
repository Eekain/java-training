package inheritancemethods.cars;

public class Jeep extends Car {

    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }
@Override
    public void modifyFuelAmount(double fuelBy) {
        if(fuelBy > getExtraFuel()){
            fuelBy -= getExtraFuel();
            setExtraFuel(0);
        } else {
            modifyExtraFuelAmount(-fuelBy);

        }
        super.modifyFuelAmount(fuelBy);
    } // örökölt metódus az ősosztályból, nem kell felülírni

    private void modifyExtraFuelAmount(double fuel) {
        extraFuel += fuel;
    }

    @Override
    public void drive(int km) {
        double consumption = km * super.getFuelRate() / 100;
        setFuel((getFuel() + getExtraFuel()) - consumption + 30);
        setExtraFuel(0);

    } // csökkenti az üzemanyag mennyiségét, nem fogyhat ki!

    @Override
    public double getFuel() {
        return super.getFuel();
    }

    public void setFuel(double fuel) {
        super.setFuel(fuel);
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
