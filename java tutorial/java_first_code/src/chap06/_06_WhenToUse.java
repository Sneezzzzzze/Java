package chap06;

public class _06_WhenToUse {
    public static int getPower(int number) {
        return getPower(number, 2);
    }
    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // Why Method is important

        // 2 power 2 is
        System.out.println(getPower(2, 2)); // 2 * 2 = 4

        // 3 power 3 is
        System.out.println(getPower(3, 3)); // 3 * 3 * 3 = 27

        // 4 power 2 is
        System.out.println(getPower(4, 2)); // 4 * 4 = 16
    }
}
