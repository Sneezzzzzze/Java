package chap02;

public class _03_operator3 {
    public static void main(String[] args) {
        // < > <= >=

        System.out.println(5 > 3); // 5 is more than 3 (if it right true else false)
        System.out.println(5 >= 3); // 5 is more than 3 (true)
        System.out.println(5 >= 5); // 5 is more than or equal 5 (true)
        System.out.println(5 >= 7); // 5 is more than or equal 7 (false)

        System.out.println(5 < 3); // 5 is less than 3 (false)
        System.out.println(5 <= 3); // 5 is less than or equal 3 (false)

        System.out.println(5 == 5); // 5 is equal 5 (true)
        System.out.println(5 == 3); // 5 is equal 3 (false)
        System.out.println(5 != 5); // 5 is not equal 5 (false)
        System.out.println(5 != 3); // 5 is not equal 3 (true)
    }
}
