package chap04;

public class _Quiz_04 {
    public static void main(String[] args) {
        String typeCar = "kyongcha";
        int time = 5;
        if (typeCar == "normal") {
            int ans = time * 4000;
            if (ans > 30000) {
                ans = 30000;
            }
            System.out.println(ans + " won");
        } else if (typeCar == "kyongcha" || typeCar == "jang ae in") {
            int ans = time * 4000;
            if (ans > 30000) {
                ans = 30000;
            }
            System.out.println(ans / 2 + " won");
        }
        }
    }

