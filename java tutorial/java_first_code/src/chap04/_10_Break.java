package chap04;

public class _10_Break {
    public static void main(String[] args) {
        // Break

        // for
        int max = 20;
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " order");
            if (i == max) {
                System.out.println("everything is done");
                break;
            }
        }
        System.out.println("finish");

        System.out.println(".........................");

        // while
        int index = 1;
        while (index <= 50) {
            System.out.println(index + " order");
            if (index == max) {
                System.out.println("everything is gone");
                break;
            }
            index++;
        }
        System.out.println("finish");
    }
}
