package pratice;

public class pr {
    public static void main(String[] args) {
        test(1);
        int sumsum = test(2)*test(3)*test(4);
        System.out.println(sumsum);

        System.out.println(parseName("이민재"));


    }
    public static int test(int i){
        int sum =0;
        sum = sum + i;
        System.out.println(sum);
        return sum;
    }

    public static String parseName(String name) {
        return (name + " 20학번");
    }


}

