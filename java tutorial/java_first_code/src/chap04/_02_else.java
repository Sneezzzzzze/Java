package chap04;

public class _02_else {
    public static void main(String[] args) {
        // else
        int hour = 15;
        if (hour < 14) {
            System.out.println("ice americano +1"); // less than 14
        } else{
            System.out.println("ice americano (dicaffeine) +1"); // more than 14
        }
        System.out.println("order complete #1");

        hour = 10;
        boolean morningCoffee = false;
        if (hour >= 14 || morningCoffee == true) {
            System.out.println("ice americano (dicaffeine) +1");
        } else {
            System.out.println("ice americano +1");
        }
        System.out.println("order complete #2");
    }
}
