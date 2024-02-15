import java.util.Scanner;

public class pratice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID ?");
        String ID = scanner.next();

        System.out.println("비 번 ?");
        String password = scanner.next();

        System.out.println("비번확인");
        String Check_password = scanner.next();

        System.out.println("이 름?");
        String name = scanner.next();

        System.out.println("주민번호?");
        String identity_num = scanner.next();

        System.out.println("전화번호?");
        String phone_num = scanner.next();

        System.out.println("주소?");
        String address = scanner.next();

        System.out.println("ID :" + ID);
        System.out.println("비밀번호 : " + password );
        System.out.println("이름 :" + name);
        System.out.println("주민번호 : " + identity_num );
        System.out.println("전화번호 :" + phone_num);
        System.out.println("주소 : " + address );




    }
}
