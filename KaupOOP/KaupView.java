package KaupOOP;
//카우프지수 구하는 프로그램을 객체지향으로 작성해주세요

import java.util.Scanner;

public class KaupView {
    public static void main(String[] args) {
        Person person = new Person();
        Scanner sc = new Scanner(System.in);
        System.out.println("이름 : ");

        person.setName(sc.next());
        person.createHeight();
        person.createWeight();
        person.createBmi();
        person.createBodyMass();

        System.out.println("키" + person.getHeight());
        System.out.println("몸무게" + person.getWeight());
        System.out.printf("bmi는 %.1f 입니다." , person.getBmi());
        System.out.println(person.getBodyMass());
    }
}
