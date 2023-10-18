package backjun_step.backjun_step5_String;

import java.util.Scanner;

public class b10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();


        int alpha[] = new int[st.length()];

        for (int k = 0; k < alpha.length; k++) {
            alpha[k] = st.charAt(k);
        }


        int result[] = new int[26];
        int alphabet[] = new int[26];
        for (int k = 0; k < result.length; k++) {
            result[k] = -1;
            alphabet[k] = k + 97;
        }


        for (int i =0; i<alpha.length;i++) { // 65 99 55 44
            for (int j = 0; j < result.length; j++) {
                if (alpha[i] ==  alphabet[j] && result[j] == -1) { // 9798
                    result[j] = i;
                }
            }
        }

        for (int k = 0; k < result.length; k++) {
            System.out.print(result[k] + " ");
        }

    }

}
