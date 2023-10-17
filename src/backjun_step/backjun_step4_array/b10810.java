package backjun_step.backjun_step4_array;

import java.util.Scanner;

public class b10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();
        int step = sc.nextInt();

        int[] basket = new int[base];
        for (int i = 0; i<basket.length; i++){
            basket[i]=0;
        }


        for (int i =0; i<step; i++){

            int first = sc.nextInt();
            int last = sc.nextInt();
            int num = sc.nextInt();

            for (int j = first; j<=last; j++){
                basket[j-1] = num;
            }

        }
        for (int i = 0; i<basket.length; i++){
            System.out.printf(basket[i]+" ");
        }





    }
}
