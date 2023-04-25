package Lab04_02;
public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        f1.topN = 2;
        f1.btmN = 5;
        Fraction f2 = new Fraction();
        f2.topN = 3;
        f2.btmN = 7;
        System.out.println("before " + f1.toFraction());
        System.out.println("before " + f1.toFloat());
        f1.addFraction(f2);
        System.out.println("after " + f1.toFraction());
        System.out.println("after " + f1.toFloat());
        
        /*Fraction f1 = new Fraction();
        f1.topN = 1;
        f1.btmN = 3;
        
        Fraction f2 = new Fraction();
        f2.topN = 4;
        f2.btmN = 16;
        
        Fraction f3 = new Fraction();
        f3.topN = 5;
        f3.btmN = 15;
        
        System.out.println(f1.toFloat());
        System.out.println(f2.toFloat());
        System.out.println(f3.toFloat());

        System.out.println("f1 is equal to f2 >> " + f1.myEquals(f2));
        System.out.println("f1 is equals to f3 >> " + f1.myEquals(f3));

        System.out.println("Before : " + f2.toFraction());
        f2.LowestTermFrac();
        System.out.println("After : " + f2.toFraction());*/
    }
}
