import java.util.*;
public class Lab02_No9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        if (x > 50000) {
            double salary = x - (0.1 * x);
            System.out.println(salary);
        }
        else if (x <= 50000) {
            double salary2 = x - (0.05 * x);
            System.out.println(salary2);
        }
    }
}
