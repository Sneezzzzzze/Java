package chap06;

public class _05_OverLoading {
    public static int getPower(int number) {
        int result = number * number;
        return result; // or just return number * number
    }
    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }
    public static int getPower(int number , int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // overloading same method name
        // 1. different type
        // 2. different amount in ()
        System.out.println(getPower(3)); // 3 * 3 = 9
        System.out.println(getPower("4")); // 4 * 4 = 16
        System.out.println(getPower(3, 3));
    }
}
