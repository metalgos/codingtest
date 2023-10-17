package backjun_step.backjun_step4_array;

import java.util.Scanner;

public class b10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int step = sc.nextInt();
        int bas = sc.nextInt();

        int[] arr = new int[step];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < bas; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            int first = num1 -1;

            int last = num2 -1;

            int temp[] = new int[last - first +1];
            int count = 0;

            for (int j = last; j >= first; j--) {
                temp[count] = arr[j];
                count++;
            }

            count = 0;
            for (int j = first; j <= last; j++) {
                arr[j] = temp[count];
                count++;
            }

        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
