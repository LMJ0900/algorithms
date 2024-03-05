package algorism;

import java.util.Scanner;

public class changeMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = 1000;
        int pay1 = sc.nextInt();
        int pay=0;
        pay = money - pay1;
        int re = 0;
        if(pay>=500){
            pay=pay-500;
            re=1;
        }
        while (pay>=100){
            pay=pay-100;
            re=re+1;
        }
        while (pay>=50){
            pay=pay-50;
            re=re+1;
        }
        while (pay>=10){
            pay=pay-10;
            re=re+1;
        }
        while (pay>=5){
            pay=pay-5;
            re=re+1;
        }
        while (pay>=1){
            pay=pay-1;
            re=re+1;
        }
        System.out.println(re);
    }
}
