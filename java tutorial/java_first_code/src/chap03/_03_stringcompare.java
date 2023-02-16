package chap03;

public class _03_stringcompare {
    public static void main(String[] args) {
        // compare String
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); // if same true if not false

        // compare without upper lower case
        System.out.println(s2.equalsIgnoreCase("python"));

        //
        s1 = "1234";
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // true

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false
    }
}
