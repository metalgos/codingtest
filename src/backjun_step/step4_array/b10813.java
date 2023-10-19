package backjun_step.step4_array;

import java.util.Scanner;

public class b10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();
        int step = sc.nextInt();

        int[] basket = new int[base];
        for (int i = 0; i < basket.length; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < step; i++) {

            int first = sc.nextInt()-1;
            int last = sc.nextInt()-1;

            int temp = 0;
            temp = basket[first];
            basket[first] = basket[last];
            basket[last] = temp;


        }
        for (int i = 0; i < basket.length; i++) {
            System.out.printf(basket[i] + " ");
        }


    }
}
