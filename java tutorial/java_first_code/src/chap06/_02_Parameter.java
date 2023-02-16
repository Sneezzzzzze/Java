package chap06;

public class _02_Parameter {
    public static void power(int number) {
        int result = number * number;
        System.out.println("power of " + number + " is " + result);
    }

    public static void powerByEXp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + " power of " + exponent + " is " + result);
    }
    public static void main(String[] args) {
        power(2); // 2 * 2 = 4
        power(3); // 3 * 3 = 4
        powerByEXp(2, 3); // 2 * 2 * 2 = 8
        powerByEXp(3, 3); // 3 * 3 * 3 = 27
        powerByEXp(10, 0); // 0
    }
}
