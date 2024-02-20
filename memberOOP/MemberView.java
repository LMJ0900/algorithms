package memberOOP;

import java.util.Scanner;

public class MemberView {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        User user = new User();

        System.out.println("id를 입력해주세요");
        user.setId(sc.next());

        System.out.println("비밀번호를 입력해주세요");
        user.setPass(sc.next());

        System.out.println("비밀번호를 한번 더 입력해주세요");
        user.setPassword(sc.next());

        System.out.println("이름를 입력해주세요");
        user.setName(sc.next());

        System.out.println("주민번호를 입력해주세요");
        user.setIdNum(sc.next());

        System.out.println("전화번호를 입력해주세요");
        user.setPhoneNum(sc.next());

        System.out.println("주소를 입력해주세요");
        user.setAddress(sc.next());

        System.out.println("직업을 입력해주세요");
        user.setJob(sc.next());

        System.out.println("ID : " + user.getId());
        System.out.println("비 번 : " + user.getPass());
        System.out.println("비번확인 : " + user.getPassword());
        System.out.println("이 름 : " + user.getName());
        System.out.println("주민번호 : " + user.getIdNum());
        System.out.println("전화번호 : " + user.getPhoneNum());
        System.out.println("주 소 : " + user.getAddress());
        System.out.println("직업 : " + user.getJob());
    }


}
