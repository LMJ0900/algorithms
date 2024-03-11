package algorism;

import java.util.Scanner;

public class SevenDwarf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int[] arr = new int[9];
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
            sum = sum+arr[i];
        }
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1; j< arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int num=0;
        int num1=0;

        for(int i=0;i<arr.length;i++) {
            for(int j=i+1; j< arr.length; j++){
                if(sum-arr[i]-arr[j]==100){
                    num=i;
                    num1=j;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            if(i==num){

            }else if(i==num1){

            }else {
                System.out.println(arr[i]);
            }

            }
        }

    }

