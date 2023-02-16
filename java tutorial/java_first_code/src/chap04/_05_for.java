package chap04;

public class _05_for {
    public static void main(String[] args) {
        // for
        System.out.println("welcome.");
        //
        System.out.println("welcome.");
        System.out.println("welcome.");
        System.out.println("welcome.");
        System.out.println("welcome.");
        System.out.println("welcome.");
        System.out.println("welcome.");
        //
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        //
        for (int i = 0; i < 5; i ++) {
            System.out.println("welcome! " + i);
        }

        // print odd number fori + Enter
        // 0 2 4 6 8
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);
        }

        System.out.println();

        // print even number
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i);
        }
        System.out.println();
        // reverse
        // 5, 4, 3, 2, 1
        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        }
        System.out.println();

        // sum of (1 to 10)
        int sum = 0;
        for (int i = 1; i <=10 ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
