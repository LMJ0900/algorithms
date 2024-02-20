/*
import java.util.Scanner;

public class pr {
    static int inputCla(Scanner sc){

        System.out.println("반의 수 : ");
        return sc.nextInt();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cla = inputCla(sc);
        int[] claArr =
        System.out.println("1반에서 시험에 응시한 학생수는 몇명입니까?");
        int numberOfStudent = sc.nextInt();

        System.out.println("2반에서 시험에 응시한 학생수는 몇명입니까?");
        int numberOfStudent2 = sc.nextInt();
        int[] scores = new int[numberOfStudent];
        int[] scores2 = new int[numberOfStudent2];

        int avg = 0;
        int avg2 = 0;
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < scores.length; i++) {
            scores[i] = (int) (Math.random() * 100);
            avg += scores[i];
            if (max1 < scores[i]) {
                max1 = scores[i];
            }
        }

        for (int i = 0; i < scores.length; i++) {
            scores[i] = (int) (Math.random() * 100);
            avg2 += scores[i];
            if (max2 < scores[i]) {
                max2 = scores[i];
            }
        }

        int re = avg / numberOfStudent;
        int re2 = avg2 / numberOfStudent2;


        System.out.println("1반의 평균 점수: " + re + "이다.");
        System.out.println("1반의 최고 점수는 : " + max1 + "이다.");
        System.out.println("2반의 평균 점수: " + re2 + "이다.");
        System.out.println("2반의 최고 점수는 : " + max2 + "이다.");
    }
}
*/
