package backjun_step.step5_String;

import java.util.Scanner;

public class b9086 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int step = sc.nextInt();

        for (int i = 0; i < step; i++) {

            String s = sc.next();


            char c = s.charAt(0), d = s.charAt(s.length()-1);
            System.out.println(c +""+ d);

        }
    }
}
