package matrixTest;
        /**
         *로또 발급은 같다
         * 로또 발급은 1~8까지 중복없는 숫자 6개이다 하나는 구매한 로또이다
         * 추가된 로직은 추첨된 로또이다
         * 두 로또의 일치여부에 따라 다음과 같은 메세지를 출력한다
         * 단 구매로또 번호와 추첨로또 번호 모두 같이 출력한다
         * 1등-6개 맞춤
         * 2등 -5개 맞춤
         * 3등 - 4개 맞춤
         * 4등 - 3개맞춤
         * 꽝 - 2개이히
         **/

public class LottoMatching {
            public static void main(String[] args) {
                int[] lotto = new int[6];
                int[] lotto2 = new int[6];
                int temp;
                int temp1;
                for (int i = 0; i < lotto.length; i++) {
                    int a = (int) (Math.random() * 8);
                    int b = (int) (Math.random() * 8);
                    lotto[i] = a;
                    lotto2[i] = b;
                    for (int j = 0; j < i; j++) {
                        if (lotto[i] == lotto[j]) {
                            i--;
                            break;
                        }
                    }


                    for (int j = 0; j < i; j++) {
                        if (lotto2[i] == lotto2[j]) {
                            i--;
                            break;
                        }
                    }
                }
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < i; j++) {
                            if (lotto[i] < lotto[j]) {
                                temp = lotto[i];
                                lotto[i] = lotto[j];
                                lotto[j] = temp;
                            }
                        }

                    }

                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < i; j++) {
                            if (lotto2[i] < lotto2[j]) {
                                temp1 = lotto2[i];
                                lotto2[i] = lotto2[j];
                                lotto2[j] = temp1;
                            }
                        }

                    }
                    int su=0;
                    for(int i=0;i<6;i++){
                        for(int j=0; j<6; j++){
                            if(lotto[i]==lotto2[j]){
                                su = su+1;
                            }
                        }
                    }


                    System.out.println("구매로또 번호는 :");
                    for (int i = 0; i < 6; i++) {
                        System.out.print(lotto[i] + " ,");
                    }
                System.out.println("");
                System.out.println("추첨 로또 번호는 : ");
                for (int i = 0; i < 6; i++) {
                    System.out.print(lotto2[i] + " ,");
                }
                System.out.println();
                if(su==6){
                    System.out.println("맞춘 개수는" + su + "이고 1등입니다.");
                }else if(su==5){
                    System.out.println("맞춘 개수는" + su + "이고 2등입니다.");
                }else if(su==4){
                    System.out.println("맞춘 개수는" + su + "이고 3등입니다.");
                }else if(su==3){
                    System.out.println("맞춘 개수는" + su + "이고 4등입니다.");
                }else if(su<=2){
                    System.out.println("맞춘 개수는" + su + "이고 꽝입니다.");
                }
            }
            }
