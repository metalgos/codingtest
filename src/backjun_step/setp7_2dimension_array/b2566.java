package backjun_step.setp7_2dimension_array;

import java.util.Scanner;

public class b2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[9][9];

        int max = 0, first = 0, last = 0;

        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < arr.length; i++) {

                arr[k][i] = sc.nextInt();
                if (arr[k][i] >= max) {
                    max = arr[k][i];
                    first = k+1;
                    last = i+1;
                }


            }

        }

        System.out.println(max);
        System.out.println(first + " " + last);


    }
}
