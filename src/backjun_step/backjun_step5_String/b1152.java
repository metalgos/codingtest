package backjun_step.backjun_step5_String;

import java.util.Scanner;

public class b1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int count = 1;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == ' ') {

                count++;
            }

        }
        if (st.charAt(0) == ' ') {
            count--;
        }
        if (st.charAt(st.length()-1) == ' ') {
            count--;
        }

        System.out.println(count);

    }
}
