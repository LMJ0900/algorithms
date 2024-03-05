package algorism;

import java.util.Scanner;

public class Ggul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=0;
        int c = sc.nextInt();
        int d = 0;
        int[] arr = new int[c];
        int[] arr1 = new int[c];
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }


            for (int i=1; i<arr.length; i++){
                a=a+arr[i];
            }


        for(int i=2; i<arr.length; i++){
            for(int j=i;j<arr.length;j++){
                b=b+arr[j];
            } arr1[i-2] = a+b-arr[i-1];
            b=0;
        }


        int max = arr1[0];
        for(int i=1; i<arr1.length; i++){
            if (max < arr[i]){
                max=arr1[i];}
        }

        System.out.println(max);
    }

    }

