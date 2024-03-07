package algorism;

import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int re=0;
        for (int i=1; i<a.length(); i++){
            if(a.charAt(i-1)!=a.charAt(i)){
                if(a.charAt(i)==a.charAt(i-2)){
                    re=re+1;
                }
            }

        }
        System.out.println(re);

    }
}
