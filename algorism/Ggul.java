package algorism;

import java.util.Scanner;

public class Ggul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=0;
        int c = sc.nextInt();
        int d = 0;
        int e = 0;
        int f=0;
        int[] arr = new int[c];
        int[] arr1 = new int[c];
        int[] arr2 = new int[c];
        int[] arr3 = new int[c];
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
            if (max < arr1[i]){
                max=arr1[i];}
        }


       d=a-arr[c-1]+arr[0];

        for(int i=2; i<arr.length; i++){
            for(int j=i+1; j<=arr.length; j++){
                e=e+arr[c-j];
            }arr2[i-2]=d+e-arr[c-i];
            e=0;
        }

        int max1 = arr2[0];
        for(int i=1; i<arr2.length; i++){
            if (max1 < arr2[i]){
                max1=arr2[i];}
        }
        f=a-arr[c-1];
        for(int i=1; i<arr.length-1; i++){
            arr3[i-1]=f+arr[i];
        }
        int max2 = arr3[0];
        for(int i=1; i<arr3.length; i++){
            if (max2 < arr3[i]){
                max2=arr3[i];}
        }


        if(max>max1){
            max1=max;
        } if(max1>max2){
            max2=max1;
        }


        System.out.println(max2);

    }

    }

