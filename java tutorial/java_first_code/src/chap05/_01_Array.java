package chap05;

public class _01_Array {
    public static void main(String[] args) {
        // Array
        String coffeeRoss = "Americano";
        String coffeeRachel = "coffeemocha";
        String coffeeChandler = "latte";
        String coffeeMonica = "cafuchino";

        System.out.println(coffeeRoss + " one");
        System.out.println(coffeeRachel + " one");
        System.out.println(coffeeChandler + " one");
        System.out.println(coffeeMonica + " one");
        System.out.println("plz");

        // 1st form
        // String[] coffees = new String[4];
        // same as String coffees[] = new String[4];

        // 2nd form
        // String[] coffees = new String[4];
//        coffees[0] = "Americano";
//        coffees[1] = "coffeemocha";
//        coffees[2] = "latte";
//        coffees[3] = "cafuchino";

        // 3rd form
        //String[] coffees = new String[] { "americano", "coffeemocha", "latte", "cafuchino"};

        // 4th form
        String[] coffees = {"americano", "coffeemocha", "latte", "cafuchino"};

        System.out.println("...........................");
        System.out.println(coffees[0] + " one");
        System.out.println(coffees[1] + " one");
        coffees[2] = "espresso";
        System.out.println(coffees[2] + " one");
        System.out.println(coffees[3] + " one");
        System.out.println("plz");

        // Array int, double, boolean
        int[] i = {1, 2, 3};
        double[] d = {10.0, 11.2, 13.5};
        boolean[] b = {true, false, true};
    }
}
