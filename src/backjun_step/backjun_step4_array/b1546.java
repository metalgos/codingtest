package backjun_step.backjun_step4_array;

import java.util.Scanner;

public class b1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int step = sc.nextInt();
        int[] arr = new int[step];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        double result[] = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {

            result[i] = Double.valueOf(arr[i]) / max * 100;

        }
        double sum = 0;
        for (double i : result) {
            sum += i;
        }
        sum /= arr.length;

        System.out.println(sum);


    }
}
