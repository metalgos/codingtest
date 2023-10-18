package backjun_step.backjun_step6_Additional_learning1;

import java.util.Scanner;

public class b2941 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String arr[] = new String[str.length()];

        char pre;
        char last;
        int count = 0;
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;

            if (i > 1) {
                String temp = str.substring(i - 2, i+1);
                if (temp.equals("dz=")) {
                    //System.out.println("dz -");
                    count -= 2;
                    continue;
                }
            }if (str.charAt(i) == '-' || str.charAt(i) == '=') {
               // System.out.println("= -");
                count--;
            }

            if (i > 0) {
                String temp = str.substring(i - 1, i+1);

                if (temp.equals("lj") || temp.equals("nj")) {
                   // System.out.println("ij -");
                    count -= 1;
                }
            }

        }
        System.out.println(count);


    }


}
