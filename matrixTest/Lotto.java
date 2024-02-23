package matrixTest;

import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        int temp;
        for(int i=0; i< lotto.length; i++){
           int a = (int)(Math.random()*45);
           lotto[i]=a;
           for(int j=0; j<i; j++){
               if (lotto[i] == lotto[j]){
                       i--;
                       break;
               }
               }
           }
        for(int i=0; i< lotto.length; i++){
            for(int j =0; j<i; j++){
            if(lotto[i]<lotto[j]){
            temp=lotto[i];
            lotto[i]=lotto[j];
            lotto[j]=temp;
            }
            }

        }
        for(int i=0; i<6; i++){
            System.out.println(lotto[i]);
        }

    }


}

