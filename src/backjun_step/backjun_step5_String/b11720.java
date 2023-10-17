package backjun_step.backjun_step5_String;

import java.util.Scanner;

public class b11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int step = sc.nextInt();
        String st =sc.next();

        int sum =0;
        for (int i =0; i<step;i++){
            char c =st.charAt(i);
            sum += Integer.valueOf(String.valueOf(c));

        }
        System.out.println(sum);

    }


}
