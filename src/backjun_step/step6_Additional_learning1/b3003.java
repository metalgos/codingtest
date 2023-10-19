package backjun_step.step6_Additional_learning1;

import java.util.Scanner;

public class b3003 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ch[] = {1, 1, 2, 2, 2, 8};
        int num[] = new int[ch.length];
        for (int i = 0; i < ch.length; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < ch.length; i++) {
            num[i] = ch[i] - num[i];
            System.out.print(num[i] + " ");
        }

    }

}
