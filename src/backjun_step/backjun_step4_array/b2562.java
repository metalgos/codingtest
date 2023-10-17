package backjun_step.backjun_step4_array;

import java.util.Scanner;

public class b2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] arr = new int[9];

        int max = arr[0], index = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);


    }
}
