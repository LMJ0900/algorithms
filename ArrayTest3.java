import java.util.Scanner;

public class ArrayTest3 {
    /*
    *최적화 문제 중 최대값 구하기
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("입력된 수 중에서 큰 수를 구하시오");
        int [] arr = new int[2];
        for(int i =0;i<2;i++){
            System.out.println("자연수를 입력하세요");
            String num = sc.next();
            arr[i] = Integer.parseInt(num);
        }
        System.out.println("첫번째 수: " +arr[0]);
        System.out.println("두번째 수: " +arr[1]);
        if(arr[0]<arr[1]) {
            System.out.println("입력된 값중 최대값은 " + arr[1] + "이다.");
        }else {
            System.out.println("입력된 값중 최대값은 " + arr[0] + "이다.");
        }





       /* for (int i = 0; i < 2; i++) {
            System.out.println("자연수를 입력하세요");
            String num = sc.next();
            int num1 = Integer.parseInt(num);
            if (0 < num1) {
                System.out.println("입력 숫자는 " + num1 + "입니다.");
            } else {
                System.out.println("자연수가 아닙니다.");
            }*/

        }
    }
//}
