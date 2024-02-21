package matrixTest;

public class Maxtrix5 {
    public static void main(String[] args) {
        int re = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 6; j++) {
                re = i * j;
                System.out.printf ("%3d * %d = %3d",j,i,re);
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int i = 1; i < 10; i++) {
            for (int j = 6; j < 10; j++) {
                re = i * j;
                System.out.printf("%3d * %d = %3d" ,j,i,re);
            }
            System.out.println(" ");
        }
    }
}
