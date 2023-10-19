package backjun_step.step5_String;

import java.util.Scanner;

public class b2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        for (int k = 0; k<base;k++) {


            int step = sc.nextInt();
            String st = sc.next();

            for (int i = 0; i < st.length(); i++) {
                for (int j = 0; j < step; j++) {
                    System.out.print(st.charAt(i));

                }


            }
            System.out.println();

        }
    }
}
