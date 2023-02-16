package chap04;

public class _07_dowhile {
    public static void main(String[] args) {
        // Do While
        int distance = 25;
        int move = 0;
        int height = 2;
        while (move +  height < distance) {
            System.out.println("continuing");
            System.out.println("distance :" + move);
            move += 3;
        }
        System.out.println("finish");

        System.out.println("....#1....");
        //
        move = 0;
        height = 25;
        while (move +  height < distance) {
            System.out.println("continuing");
            System.out.println("distance :" + move);
            move += 3;
        }
        System.out.println("....#2....");

        // Do While
        do{
            System.out.println("continuing");
            System.out.println("distance :" + move);
            move += 3;
        } while (move + height < distance);
        System.out.println("finish");
    }
}
