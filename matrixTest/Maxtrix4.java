package matrixTest;

public class Maxtrix4 {
    public static void main(String[] args) {
        int[][] mtx = new int[5][5];
        int k = 1;
        for (int i = 0; i < mtx.length; i++) {
            for(int j=0; j< mtx[i].length; j++){
                mtx[i][j] = k;
                k++;
            }
        }
        for(int i=mtx.length; i>1; i--){
            for(int j =mtx.length; j >1; j--) {
                System.out.print(mtx[i][j]);
            }
            System.out.println();
        }
    }
}
