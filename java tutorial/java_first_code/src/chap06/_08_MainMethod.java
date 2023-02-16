package chap06;

public class _08_MainMethod {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }

        if (args.length == 1) {
            switch (args[0]) {
                case "1":
                    System.out.println("jo whay ");
                    break;
                case "2":
                    System.out.println("dajul");
                    break;
                case "3":
                    System.out.println("bannab");
                    break;
                default:
                    System.out.println("wrong");
            }
        } else {
            System.out.println("write only 1 - 3 option");
        }
    }
}
