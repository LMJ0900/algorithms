import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("다음 시험에서 두개 반의 평균 점수를 구하시오");

        System.out.println("1반에서 시험에 응시한 학생수는 몇명입니까?");
        int numberOfStudent = sc.nextInt();

        System.out.println("2반에서 시험에 응시한 학생수는 몇명입니까?");
        int numberOfStudent2 = sc.nextInt();
        int[] scores = new int[numberOfStudent];
        int[] scores2 = new int[numberOfStudent2];

        int avg=0;
        int avg2=0;
        for(int i =0;i<scores.length;i++){
            System.out.println( "1반 점수를 입력: ");
            scores[i] = sc.nextInt();
            avg += scores[i];
            }

        for(int i =0;i<scores.length;i++){
            System.out.println("2반 점수를 입력: ");
            scores[i] = sc.nextInt();
            avg2 += scores[i];
        }

            int re = avg/numberOfStudent;
            int re2 = avg2/numberOfStudent2;
            int re3 = (re*numberOfStudent + re2*numberOfStudent2)/(numberOfStudent+numberOfStudent2);

        System.out.println("1반의 평균 점수: " + re + "이다.");
        System.out.println("2반의 평균 점수: " + re2 + "이다.");
        System.out.println("전체 평균은 : " + re3 + "이다.");

        }





    }
