package matrixTest;

import java.util.Random;
import java.util.Scanner;

public class LottoA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BuyLotto buyLotto = new BuyLottoImpl();
        LottoDraw lottoDraw = new LottoDrawImpl();
        SortArray sort = new SortArrayImpl();
        MatchingLotto matchingLotto = new MatchingLottoImpl();
        Print print = new PrintImpl();

        int[] mylotto = new int [6];
        int[] lotto = new int [6];

        buyLotto.enterNumber(mylotto,sc);
        lottoDraw.createLotto(lotto);
        sort.sortAscending(mylotto);
        sort.sortAscending(lotto);
        print.printLotto(lotto);
        print.buyLotto(mylotto);
        print.result(matchingLotto.matchingLotto(mylotto,lotto));
    }
}

interface SortArray {
    int[] sortAscending(int[] arr);
}

class SortArrayImpl implements SortArray {

    @Override
    public int[] sortAscending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
        return arr;
    }
}

interface LottoDraw {
    int createRandomNumber(int start, int end);

    int[] createLotto(int[] lotto);
}

class LottoDrawImpl implements LottoDraw {

    @Override
    public int createRandomNumber(int start, int end) {
        Random random = new Random();
        return random.nextInt(end) + start;
    }

    @Override
    public int[] createLotto(int[] lotto) {
        for (int i = 0; i < lotto.length; i++) {
            boolean check = false;
            int randomNumber = createRandomNumber(1, 8);
            for (int j = 0; j < lotto.length; j++) {
                if (lotto[j] == randomNumber) {
                    //중복되면 check를 true로 바꿔라
                    check = true;
                }
            }
            if (check == false) {
                // 중복되지 않았으니 배열에 담아라.
                lotto[i] = randomNumber;
            } else {
                i--; // 중복됐으면 이번 회수는 무효로 하고 다시 뽑아라.
            }
        }
        return lotto;
    }
}

interface BuyLotto {
    int[] enterNumber(int[] buyLotto, Scanner sc);
}

class BuyLottoImpl implements BuyLotto {

    @Override
    public int[] enterNumber(int[] buyLotto, Scanner sc) {
            System.out.println("로또 번호를 입력하세요");
        for (int i = 0; i < buyLotto.length; i++) {
            boolean check = false;
            int buyNuber = sc.nextInt();
            for (int j = 0; j < buyLotto.length; j++) {

                if (buyLotto[j] == buyNuber) {
                    //중복되면 check를 true로 바꿔라
                    check = true;
                }
            }
            if (check == false) {
                // 중복되지 않았으니 배열에 담아라.
                buyLotto[i] = buyNuber;
            } else {
                i--; // 중복됐으면 이번 회수는 무효로 하고 다시 뽑아라.
            }
        }
        return buyLotto;
    }
}

interface MatchingLotto {
    String matchingLotto(int[] buyLotto, int[] lotto);
}

class MatchingLottoImpl implements MatchingLotto {

    @Override
    public String matchingLotto(int[] buyLotto, int[] lotto) {
        String result = "";
        int match = 0;
        for (int i = 0; i < lotto.length; i++) {
            for (int j = 0; j < buyLotto.length; j++) {
                if (lotto[i] == buyLotto[j]) {
                    match++;
                }
                switch (match) {
                    case 6:
                        result = "6";
                        break;
                    case 5:
                        result = "5";
                        break;
                    case 4:
                        result = "4";
                        break;
                    case 3:
                        result = "3";
                        break;
                    case 2, 1, 0:
                        result = "0";
                        break;
                }
            }
        }
        return result;
    }
}

interface Print {
    void printLotto (int[] lotto);
    void buyLotto (int[] buylotto);
    void result (String result);
}

class PrintImpl implements Print{

    @Override
    public void printLotto(int[] lotto) {
        System.out.println("------당첨 로또번호-----");
        for(int i=0;i<lotto.length;i++){
            System.out.print(lotto[i]+ "\t");
        }
    }

    @Override
    public void buyLotto(int[] buylotto) {
        System.out.println("\n------나의 로또번호-----");
        for(int i=0;i<buylotto.length;i++){
            System.out.print(buylotto[i] + "\t");
        }
    }

    @Override
    public void result(String  matchingLotto) {

        switch (matchingLotto){
            case "6" :
                System.out.println("\n1등입니다.");
                break;
            case "5" :
                System.out.println("\n2등입니다.");
                break;
            case "4" :
                System.out.println("\n3등입니다.");
                break;
            case "3" :
                System.out.println("\n4등입니다.");
                break;
            case "0","1","2" :
                System.out.println("\n꽝!");
                break;


        }
    }
}