package chap02;

public class _01_operator1 {
    public static void main(String[] args) {
        // calculate

        // + - * /
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(5 / 2); // 2
        System.out.println(2 / 4); // 0
        System.out.println(4 % 2); // 0
        System.out.println(5 % 2); // 1

        // PEMDAS
        System.out.println(2 + 2 * 2); // 8 or 6, answer is 6!!
        System.out.println((2 + 2) * 2); // 8
        System.out.println(2 + (2 * 2)); // 6

        // with variable
        int a = 20; int b = 10; int c;
        c = a + b;
        System.out.println(c); // 30
        c = a - b;
        System.out.println(c); // 10
        c = a * b;
        System.out.println(c); // 200
        c = a / b;
        System.out.println(c); // 2
        c = a % b;
        System.out.println(c); // 0

        // ++ --
        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11
        System.out.println(val); // 11

        val = 10;
        System.out.println(val);; // 10
        System.out.println(val++); // 10
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // 9
        System.out.println(val); // 9

        val = 10;
        System.out.println(val); // 10
        System.out.println(val--); // 10
        System.out.println(val); // 9

        // waiting ticket
        int waiting = 0;
        System.out.println("wait people : " + waiting++); // wait people : 0
        System.out.println("wait people : " + waiting++); // wait people : 1
        System.out.println("wait people : " + waiting++); // wait people : 2
        System.out.println("all waiting : " + waiting); // all waiting = 3
        
        
    }
}
