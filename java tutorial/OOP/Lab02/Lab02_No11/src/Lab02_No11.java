import java.util.*;
public class Lab02_No11 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please insert your name : ");
    String name = sc.nextLine();
    System.out.print("Please insert your age : ");
    int Age = sc.nextInt();
    System.out.print("Please insert number of working days : ");
    int WorkingDay = sc.nextInt();
    System.out.print("Please insert number of absent days : ");
    int AbsentDay = sc.nextInt();
    System.out.print("Please insert your body weight : ");
    int Weight = sc.nextInt();
    int Salary = 0, bonus = 0;
    if (21 <= Age & Age <= 30) {
        Salary = (WorkingDay * 300) - (AbsentDay * 50);
    } else if (31 <= Age & Age <= 40) {
        Salary = (WorkingDay * 500) - (AbsentDay * 50);
    } else if (41 <= Age & Age <= 50) {
        Salary = (WorkingDay * 1000) - (AbsentDay * 25);
    } else if (51 <= Age & Age <= 60) {
        Salary = WorkingDay * 3000;
    }
    if (10 <= Weight & Weight <= 60) {
        bonus = Salary + 5000;
    } else if (61 <= Weight & Weight <= 90) {
        bonus = Salary + (5000 - (Weight - 60) * 10);
    } else{
        bonus = bonus;
    }
    System.out.println("Hi, " + name + "\nYour salary is " + Salary + " Baht");
    System.out.println("Your salary and bonus is " + bonus + " Baht");
    }
}