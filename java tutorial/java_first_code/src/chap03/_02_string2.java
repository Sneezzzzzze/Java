package chap03;

public class _02_string2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // transform String
        System.out.println(s.replace(" and", ",")); // change and -> ,
        System.out.println(s.substring(7)); // start at index 7
        System.out.println(s.substring(s.indexOf("Java"))); // find index of Java and start at index of Java
        // start at index of Java and end at index of .
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf(".")));

        // delete blank
        s = "                      I love Java.    ";
        System.out.println(s);
        System.out.println(s.trim()); // delete all blank

        // combine
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2); // JavaPython
        System.out.println(s1 + "," + s2); // Java,Python
        System.out.println(s1.concat(",").concat(s2)); // Java,Python
    }
}
