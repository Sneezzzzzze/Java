package chap02;

public class _04_operator4 {
    public static void main(String[] args) {
        // All Any
        boolean soupKimchi = true;
        boolean egg = true;
        boolean pork = true;

        System.out.println(soupKimchi || egg || pork); // if anything of this is true equal true
        System.out.println(soupKimchi && egg && pork); // all true is true

        // And
        System.out.println((5 > 3) && (3 > 1)); // 5 more than 3 and 3 more than 1 = (true)
        System.out.println((5 > 3) && (3 < 1)); // 5 more than 3 and 3 less than 1 = (false)

        // Or
        System.out.println((5 > 3) || (3 > 1)); // 5 more than 3 and 3 more than 1 = (true)
        System.out.println((5 > 3) || (3 < 1)); // 5 more than 3 and 3 less than 1 = (true)
        System.out.println((5 < 3) || (3 < 1)); // 5 less than 3 and 3 less than 1 = (false)

        // System.out.println(1 < 3 < 5); can't

        // reverse
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(5 == 5)); // false
        System.out.println(!(5 == 3)); // true

    }
}
