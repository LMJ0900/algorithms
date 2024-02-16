import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요");
        String num1 = sc.next();
        int intNum1 = Integer.parseInt(num1);
        System.out.println("출력 숫자는 " + intNum1 + "입니다.");
    }
}
