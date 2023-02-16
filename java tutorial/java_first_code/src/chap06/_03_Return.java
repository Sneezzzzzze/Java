package chap06;

public class _03_Return {
    public static String getPhoneNumber() {
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }
    public static String gedAddress() {
        return "somewhere";
    }
    public static String getActivity() {
        return "basket ball court";
    }

    public static void main(String[] args) {
        String contactNumber = getPhoneNumber();
        System.out.println("number is : " + contactNumber);

        String address = gedAddress();
        System.out.println("address : " + address);

        System.out.println("activity : " + getActivity());
    }
}
