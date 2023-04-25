package Lab07_02;
public class Ship extends Vehicle implements Floatable{
    public Ship(){
        super();
    };
    public Ship(double fuel) {
        super(fuel);
    }
    public void fl0at() {
        if (getFuel() >= 50) {
            setFuel(getFuel() - 50);
            System.out.println("Ship moves");
        } else {
            System.out.println("Fuel is not enough.");
        }
    }
    public void startEngine() {
        if (getFuel() >= 10) {
            setFuel(getFuel() - 10);
            System.out.println("Engine starts");
        } else {
            System.out.println("Fuel is not enough.");
        }
    }
    public void stopEngine() {
        System.out.println("Engine stops"); 
    }
    public void honk() {
        System.out.println("Shhhhh");
    }
    public void move() {
        this.fl0at();
    }
    public void move(int distance) {
        if (getFuel() < 50) {
            System.out.println("Fuel is not enough.");
        } else {
            for (int i = distance; i > 0; i--) {
                this.fl0at();
            }
        }
    }
}
