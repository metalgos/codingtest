package backjun_step.step6_Additional_learning1;

import java.util.Scanner;

public class b1316 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        int result = 0;

        for (int j = 0; j < count; j++) {
            int index;
            int pre = 0;
            String str = sc.nextLine();
            int alpa[] = new int[26];
            result++;
            int delta[] = new int[26];
            for (int i = 0; i < str.length(); i++) {

                int temp = str.charAt(i) - 97;


                if (delta[temp] == 0 && alpa[temp] == 0) {
                    delta[temp]++;
                    pre = temp;

                } else if (alpa[temp] >= 1 && alpa[temp] != 0 && temp != pre) {
                    result--;
                    break;
                }
                alpa[temp]++;


            }


        }
        System.out.println(result);

    }
}
