import java.util.*;
public class Lab03_No3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        int x = sc.nextInt();
        for (int i = 1; i < x+1; i++) {
            if (i % 5 == 0){
                System.out.print("/");
            } else {
                System.out.print("|");
            }
        }
        System.out.println("");
    }
}
