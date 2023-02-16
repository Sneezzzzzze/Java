package chap06;

public class _Quiz_06 {
    public static String getHiddenData(String name , int number) {
        if (name.length() == 3) {
            name = name.substring(0, number);
            name = "이름 : " + name + "**";
        } else if (name.length() == 14) {
            name = name.substring(0, number);
            name = "주민등록번호 : " + name + "******";
        } else if (name.length() == 13) {
            name = name.substring(0, number);
            name = "전화번호 : " + name + "****";
        }
        return name;
    }
    public static void main(String[] args) {
        String nam = "나코딩";
        String id = "990130-1234567";
        String phone = "010-1234-5678";
        System.out.println(getHiddenData(nam, 1));
        System.out.println(getHiddenData(id, 8));
        System.out.println(getHiddenData(phone, 9));
    }
}
