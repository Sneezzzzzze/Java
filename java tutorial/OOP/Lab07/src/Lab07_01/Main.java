package Lab07_01;
public class Main {
    public static void main(String[] args) {
        /*Account a1 = new Account();
        a1.showAccount();*/
        
        /*Account a1 = new Account(50000, "61070033");
        a1.showAccount();
        a1.deposit(500);
        a1.showAccount();
        a1.withdraw(40000);
        a1.showAccount();*/
        
        /*CheckingAccount a1 = new CheckingAccount(50000,"61070033",5000);
        a1.showAccount();
        a1.deposit(500);
        System.out.println(a1);
        a1.withdraw("40000.0");
        System.out.println(a1.toString());/*
        
        /*CheckingAccount a1 = new CheckingAccount();
        a1.deposit(500);
        System.out.println(a1);
        a1.withdraw(40000.0);
        System.out.println(a1.toString());*/
        
        /*Account a1 = new CheckingAccount();
        a1.setCredit(1000);
        System.out.println(a1);*/
        
        /*Account a1 = new CheckingAccount();
        a1.setName("Nook");
        System.out.println(a1);
        ((CheckingAccount)a1).setCredit(1000);
        System.out.println(a1);*/
        
        /*CheckingAccount a1 = new CheckingAccount(1000,"62070033",500);
        Customer c1 = new Customer();
        Customer c2 = new Customer("Harry","Potter");
        Customer c3 = new Customer("Harry","Potter",a1);
        System.out.println(c2);
        System.out.println(c3);*/
        
        /*CheckingAccount a1 = new CheckingAccount(1000,"62070033",500);
        Customer c1 = new Customer();
        Customer c2 = new Customer("Harry","Potter");
        Customer c3 = new Customer("Harry","Potter",a1);
        System.out.println(c1.equals(c2));
        System.out.println(c3.equals(c2));*/
        
        /*CheckingAccount a1 = new CheckingAccount(50000,"61070033",5000);
        a1.showAccount();
        a1.deposit(500);
        System.out.println(a1);
        a1.withdraw("40000.0");
        System.out.println(a1.toString());*/
        CheckingAccount acct1 = new CheckingAccount(1000, "A0001", 500);
        Customer cust = new Customer("Sompong", "Sookjai", acct1);
        cust.getAcct().deposit(500);
        cust.getAcct().withdraw(1800);
        cust.getAcct().withdraw(300);
        cust.getAcct().deposit(1000);
        cust.getAcct().withdraw(200);
    }
}
