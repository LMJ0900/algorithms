package gradeOOP;

import java.util.Scanner;

public class GradeView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        student.setName(sc.next());

        student.createScore();
        student.createKor();
        student.createEnglish();




        System.out.println(" ============= 성적표 ==============");
        System.out.println("이름 : " + student.getName());
        System.out.println("국어점수 : " + student.getKor());
        System.out.println("영어점수 : "+ student.getEnglish());
        System.out.println("수학점수 : "+ student.getMath());
        System.out.println("평균 점수: "+ student.getScore());

    }
}
