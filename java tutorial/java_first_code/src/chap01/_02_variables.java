package chap01;

public class _02_variables {
    public static void main(String[] args) {
        String name = "hi";
        int hour = 15;

        System.out.println(name + " junbeom." + hour + " o clock");
        System.out.println(name + " kim");

        double score = 90.5;
        char grade = 'A';
        name = "junbeom";

        System.out.println(name + " score is " + score);
        System.out.println("grade is " + grade);

        boolean pass = true;
        System.out.println("Did he pass? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F;
        System.out.println(d);
        System.out.println(f);

        long l  = 10000000000000000L;
        l = 1_000_000_000;
        System.out.println(l);

        // int, long, double, float, String, boolean
    }
}
