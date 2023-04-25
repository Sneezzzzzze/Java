import java.util.*;
public class Lab03_No2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), a=0, b=0;
        while(x != -1) {
            x = sc.nextInt();
            if (x % 2 == 0) {
                a += 1;
            } else{
                b +=1;
            }
        }
        System.out.println("Odd number = " + b + " and Even number " + a);
    }
}
