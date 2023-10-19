package backjun_step.setp7_2dimension_array;

import java.util.Scanner;

public class b2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[100][100];

        int step = sc.nextInt();
        for (int i = 0; i < step; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int k = x; k < x + 10; k++) {
                for (int j = y; j <y + 10; j++) {
                    arr[k][j]++;
                }
            }
        }

        int result = 0;
        for (int k = 0; k < 100; k++) {
            for (int j = 0; j < 100; j++) {
                if (arr[k][j] >= 1) {
                    result++;
                }

            }
        }


        System.out.println(result);
    }
}
