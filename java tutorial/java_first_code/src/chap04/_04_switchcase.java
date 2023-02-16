package chap04;

public class _04_switchcase {
    public static void main(String[] args) {
        // Switch Case

        // if else case
        int ranking = 4;
        if (ranking == 1) {
            System.out.println("100%");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("50%");
        } else {
            System.out.println("not in the case");
        }
        System.out.println("complete #1");

        // Switch case
        ranking = 4;
        switch (ranking) {
            case 1:
                System.out.println("100%");
                break;
            case 2:
                System.out.println("50%");
                break;
            case 3:
                System.out.println("50%");
                break;
            default:
                System.out.println("not in the case");
        }
        System.out.println("complete #2");

        // case2 + case3
        ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("100%");
                break;
            case 2:
            case 3:
                System.out.println("50%");
                break;
            default:
                System.out.println("not in the case");
        }
        System.out.println("complete #3");

        //
        int grade = 1;
        int price = 7000;
        switch (grade){
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + " grade price is :" + price + "baht");
        // 1st grade price 10000 baht
        // 2nd grade price 9000 baht

    }
}
