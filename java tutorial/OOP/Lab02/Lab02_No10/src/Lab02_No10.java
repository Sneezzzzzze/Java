import java.util.*;
public class Lab02_No10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money : ");
        double Money = sc.nextDouble();
        System.out.print("Input your account type(Please type A B C or X in uppercase) : ");
        char Account_Type = sc.next().charAt(0);
        switch (Account_Type) {
            case 'A': case'c':
                Money = Money + (Money * (1.5/100)); 
                break;
            case 'B':
                Money = Money + (Money * (2.0/100));
                break;
            case 'X':
                Money = Money + (Money * (5.0/100));
        }
        System.out.println("Your total money in one year = " + (int)Money);
    }
}
