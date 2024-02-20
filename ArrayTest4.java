import java.util.Scanner;

public class ArrayTest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int mat = 0;
        System.out.println("다음 시험에서 1등 학생의 이름과 점수를 구하시오");

        System.out.println("시험에 응시한 학생의 수는 몇명입니까");
        int member = sc.nextInt();

        String[] names = new String[member];
        int[] score = new int[member];

        System.out.println("학생수는 " + member + "명입니다.");
        for(int i = 0;i<names.length;i++){
            System.out.println("응시한 학생의 이름을 입력하세요");
            names[i] = sc.next();
        }

        for(int i =0;i<score.length;i++){
            System.out.println("점수를 입력하세요");
            score[i] = sc.nextInt();
            if(score[i]>max){
                max=score[i];
                mat=i;
            }
        }


        System.out.println(names[mat] + "최고 득점은 " + max + "입니다.");



        }
    }
