package chap01;

public class _06_typecasting {
    public static void main(String[] args) {
        // typecasting
        // changing type

        // int -> float, double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float)score); // 93.0
        System.out.println((double)score); // 93.0

        // float, double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int)score_f); // 93
        System.out.println((int)score_d); // 98

        //score = 93 + 98.8;
        score = 93 + (int) 98.8; // 93 + 98
        System.out.println(score);
        score_d = (double) 93 + 98.8; // 93.0 + 98.8
        System.out.println(score_d); // 191.8

        // add typecasted data

        double convertedScoreDouble = score; // 191 -> 191.0
        // int -> long -> float -> double (Auto)

        int convertedScoreInt = (int) score_d; // 191.8 -> 191
        // double -> float -> long -> int (not Auto)

        // number to string
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93); // same with upper one
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2); // 98.8

        // string to number
        int i = Integer.parseInt("93");
        System.out.println(i); // 93

        double d = Double.parseDouble("98.8");
        System.out.println(d); // 98.8

        // error
        int error = Integer.parseInt("java");

    }
}
