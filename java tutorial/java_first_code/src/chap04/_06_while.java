package chap04;

public class _06_while {
    public static void main(String[] args) {
        // while
        int distance = 25;
        int move = 0;
        while(move < distance){
            System.out.println("continuing");
            System.out.println("distance :" + move);
            move += 3;
        }
        System.out.println("finish");
    }
}
