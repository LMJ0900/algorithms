package algorism;

import java.util.Scanner;

public class Ggul2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        a= sc.nextInt();
        int[] arr1 = new int[a];
        int[] arr2 = new int[b];
        int[] arr = new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=1;i<arr.length;i++){
                a=a+arr[i];
        }
        for(int i=0;i<arr.length; i++){

            for(int j=i;j<arr.length;j++){
                b=b+arr[j];
            }

        }
        for(int i=2; i<arr.length; i++){
        b=a-arr[i]+arr1[i];
        }


        System.out.println(b);
    }
}
