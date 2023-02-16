package chap04;

public class _03_elseif {
    public static void main(String[] args) {
        // else if

        boolean hallabongAde = true;
        boolean mangoJuice = true;

        if (hallabongAde) {
            System.out.println("hallabongAde +1");
        } else if (mangoJuice) {
            System.out.println("mango juice +1");
        } else {
            System.out.println("ice americano +1");
        }
        System.out.println("order complete #1");

        // else if can use multiple

        hallabongAde = false;
        mangoJuice = false;
        boolean orangeJuice = true;

        if (hallabongAde) {
            System.out.println("hallabongAde +1");
        } else if (mangoJuice) {
            System.out.println("mango juice +1");
        } else if (orangeJuice) {
            System.out.println("orange juice +1");
        } else {
            System.out.println("ice americano +1");
        }
        System.out.println("order complete #2");
    }
}
