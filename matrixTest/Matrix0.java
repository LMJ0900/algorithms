package matrixTest;

public class Matrix0 {
    public static void main(String[] args) {
        int[][] mtx = new int[5][5];
        int k=1;
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[i].length; j++) {
                mtx[i][j] = k;
                k++;
            }

        }
        for(int i=0;i<mtx.length; i++){
            if(i%2==0) {
                for (int j = 0; j < mtx[i].length; j++) {
                    System.out.printf("%3d", mtx[i][j]);
                }
                System.out.println();
            }else  {
                for (int j=mtx.length-1;j>=0;j--){
                    System.out.printf("%3d", mtx[i][j]);
                }
                System.out.println();
            }
        }
    }
}
