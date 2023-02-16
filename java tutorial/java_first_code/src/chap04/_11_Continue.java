package chap04;

public class _11_Continue {
    public static void main(String[] args) {
        // continue

        // for
        int max = 20;
        int sold = 0;
        int noShow = 17;
        for (int i = 1; i <= 50 ; i++) {
            System.out.println(i + "chicken is finish");

            // (noShow)
            if (i == noShow) {
                System.out.println(i + "other customer get chance");
                continue;
            }

            sold ++;
            if (sold == max) {
                System.out.println("everything is gone");
                break;
            }
        }
        System.out.println("finish");
        System.out.println("...............");

        // while
        sold = 0;
        int index = 1;
        while (true) {
            index ++;
            System.out.println(index + " chicken is finish");

            if (index == noShow) {
                System.out.println(index + " other customer get chance");
                continue;
            }
            sold ++;
            if (sold == max) {
                System.out.println("everything is gone");
                break;
            }
        }
        System.out.println("finish");
    }
}
