package Lab05_02;
public class Plane extends Vehicle{
    public void setPlaneInfo(int s, String t) {
        setFuel(s);
        setTopSpeed(t);
    }
    public void showPlaneInfo() {
        System.out.print("Plane detail is, ");
        showInfo();
    }
    public void fly() {
        if (getFuel() <= 200) {
            System.out.println("Please add fuel.");
        } else {
            int m = -200;
            setFuel(m);
            System.out.println("Fly.");
        }
    }
}
