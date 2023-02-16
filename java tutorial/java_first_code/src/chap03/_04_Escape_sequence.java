package chap03;

public class _04_Escape_sequence {
    public static void main(String[] args) {
        // (Escape Sequence, Escape Character, Special Character)
        // \n \t \\ \" \'
        System.out.println("Java");
        System.out.println("is");
        System.out.println("fun");

        System.out.println("Java\nis\nfun");
        // kimchi       1000
        // kime      1000
        // ki       1000
        System.out.println("kimchi\t1000");
        System.out.println("kime\t1000");
        System.out.println("ki\t\t1000");

        // \\
        System.out.println("C:\\Program Files\\Java");

        // \\
        // kitty said miao
        System.out.println("kitty \"said\" miao");

        // \'
        // kitty said what's up
        System.out.println("kitty 'said' what's up");
        System.out.println("kitty \'said\' what's up");

        char c = 'A';
        c = '\'';
        System.out.println(c);


    }
}
