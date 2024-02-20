package kaupTest;

public class KaupMain {
   // 카우프지수 구하는 프로그램을 작성해주세요 new* 키1.5~2.0m 몸무게 30~130


    public static void main(String[] args) {
        double height = (double) (Math.random());
        double weight = (double) (Math.random()*100);
        double re=0;
        double re2=0;
        if(height<0.5){
            re=height+1.5;
        }else if(height<1) {
            re = height+1;
        }

        if(weight<30){
            re2=weight+100;
        }else if(weight<60){
            re2=weight+70;
        }else {re2=weight;}
        double bmi = re2/(re*re);
        System.out.println(re);
        System.out.println(re2);
        System.out.println("bmi 지수는 : " + bmi + "입니다.");
    }
}
