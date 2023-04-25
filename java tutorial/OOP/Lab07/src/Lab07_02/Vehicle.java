package Lab07_02;
public abstract class Vehicle implements Dieselable{
    protected double fuel;
    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
    public double getFuel() {
        return fuel;
    }
    public void addFuel(double fuel) {
        if (fuel > 0 ) {
            this.fuel += fuel;
        } else {
            System.out.println("Fuel is empty.");
        }
    }
    public Vehicle(){
        fuel = 0.0;
    }
    public Vehicle(double fuel) {
        this.fuel = fuel;
    }
    public abstract void honk();
}
