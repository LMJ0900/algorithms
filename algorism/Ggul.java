package algorism;

import java.util.Scanner;

public class Ggul {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("배열의 수");
        int n = sc.nextInt();
        int[] arr = new int [n];
        int a=0;
        int b=0;
        int c=0;
        int a1=0;
        int b1=0;
        int c1=0;
        int a2=0;
        int b2=0;
        int c2=0;
        int max=0;
        int pr=0;
        for(int i=0;i<arr.length;i++){
            System.out.println("배열값");
        arr[i]= sc.nextInt();
        pr=i;
        }
        for(int i=1;i<arr.length;i++){
             a = a + arr[i];
        }
        for (int i=2; i<arr.length;i++){
            b = b + arr[i];
        }
        c = a + b-arr[1];
        for (int i=arr.length-1; i>0;i--){
            a1 = a1 + arr[i];
        }
        for (int i = arr.length-2; i>0; i--){
            b1 = b1 + arr[i];
        }
        c1 = a1 + b1-arr[pr-1];
        for (int i=1; i<arr.length-1; i++){
            if (max < arr[i]) {
                max = arr[i];}
        }
        for (int i=1; i<arr.length-1; i++){
            a2=a2+arr[i];
            b2=a2+max;
        }
if(b2>c){
    System.out.println(b2);
}else if(c1<c){
    System.out.println(c);
}else if(c1>b2){
    System.out.println(c1);
}
        System.out.println(c);
        System.out.println(c1);
        System.out.println(b2);
    }
}
