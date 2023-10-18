package backjun_step.backjun_step6_Additional_learning1;

import java.util.Scanner;

public class b1316 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        int result =0;

        for (int j = 0; j < count; j++) {
            int index;

            String str = sc.nextLine();
            //System.out.println(" input : "+str);
            int alpa[] = new int[26];
            result++;

            loop1:
            for (int i = 0; i < str.length(); i++) {

                int delta[] = alpa.clone();
                int temp = str.charAt(i) - 97;

                //System.out.println(temp);
                alpa[temp]++;

                index = temp; //숫자 추가된 인덱스
                //System.out.println("index : " +index);


                for(int k =0; k<alpa.length;k++){
                    if(alpa[k]!= delta[k]){ //배열끼리 검사
                        System.out.println(alpa[k] + " " + delta[k]);
                        System.out.println("k :" +k);
                        if(k<index){ // 달라진 배열 번호가 인덱스번호보다 작으면
                            if(result>0){
                                result--;
                                break loop1;
                            }

                        }
                    }
                }
            }


        }
        System.out.println(result);

    }
}
