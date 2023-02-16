package chap03;

public class _01_string1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // find len of String
        System.out.println(s.length());

        // alphabet upper lower
        System.out.println(s.toUpperCase()); // all upper
        System.out.println(s.toLowerCase()); // all lower

        // something in String
        System.out.println(s.contains("Java")); // if in s = true if not = false
        System.out.println(s.contains("C#")); // false
        System.out.println(s.indexOf("Java")); // direction of Java
        System.out.println(s.indexOf("C#")); // if not in = -1
        System.out.println(s.indexOf("and")); // first and
        System.out.println(s.lastIndexOf("and")); // last and
        System.out.println(s.startsWith("I like")); // if sentence start with (I like) = true
        System.out.println(s.endsWith(".")); // if sentence end with (.) = true
    }
}
