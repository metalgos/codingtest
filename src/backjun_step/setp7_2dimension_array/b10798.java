package backjun_step.setp7_2dimension_array;

import java.util.Scanner;

public class b10798 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        char[][] arr = new char[5][15];

        for (int k = 0; k < 15; k++) {
            for (int i = 0; i < 5; i++) {
                arr[i][k] = '-';
            }
        }

        int max = 0, first = 0, last = 0;

        for (int k = 0; k < 5; k++) {
            String str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
                arr[k][i] = str.charAt(i);
            }
        }

        for (int k = 0; k < 15; k++) {
            String str = "";
            for (int i = 0; i < 5; i++) {
                if (arr[i][k] != '-' ) {
                    str += arr[i][k];
                }
            }
            System.out.print(str);
        }


    }
}
