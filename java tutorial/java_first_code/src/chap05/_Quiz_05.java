package chap05;

public class _Quiz_05 {
    public static void main(String[] args) {
        int[] size = new int[10];
        int shoes = 245;
        for (int i = 0; i < size.length; i++) {
            shoes += 5;
            size[i] = shoes;
            System.out.println("saize "+ size[i] + " (jegoitsum)");
        }
    }
}
