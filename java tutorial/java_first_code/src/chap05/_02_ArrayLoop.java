package chap05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] coffees = {"americano", "coffeemocha", "latte", "cafuchino"};

        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " one");
        }
        System.out.println("plz");

        System.out.println(".....................");

        // len Array
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " one");
        }
        System.out.println("plz");

        System.out.println(".....................");

        // enhanced for (for-each)
        for (String coffee : coffees) {
            System.out.println(coffee + " one");
        }
        System.out.println("plz");
    }
}
