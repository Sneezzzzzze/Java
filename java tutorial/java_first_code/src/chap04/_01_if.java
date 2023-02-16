package chap04;

public class _01_if {
    public static void main(String[] args) {
        // if
        int hour = 10; // 10 am
        if (hour < 14)
            System.out.println("ice americano +1");

        if (hour < 14) {
            System.out.println("ice americano +1");
            System.out.println("add one shot");
        }
        System.out.println("order coffee complete#1");

        // before 2 pm, didn't drink at the morning
        hour = 10;
        boolean morningCoffee = true;
        if (hour < 14 && morningCoffee == false){ // or you can use !morning
            System.out.println("ice americano +1");
        }
        System.out.println("order complete#2");

        hour = 15;
        morningCoffee = true;
        if (hour >= 14 || morningCoffee){
            System.out.println("ice americano(dicaffeine) +1");
        }
        System.out.println("order complete #3");
    }
}
