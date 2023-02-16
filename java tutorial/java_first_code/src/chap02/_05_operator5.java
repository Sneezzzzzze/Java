package chap02;

public class _05_operator5 {
    public static void main(String[] args) {
        // if else
        // ans = (if) ? (if true) : (false)
        int x = 3;
        int y = 5;

        int max = (x > y) ? x : y;
        System.out.println(max); // 5

        int min = (x < y) ? x : y;
        System.out.println(min); // 3

        boolean b = (x == y) ? true : false;
        System.out.println(b); // false

        String s = (x != y) ? "different" : "same";
        System.out.println(s); // different
    }
}
