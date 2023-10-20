package solved_class2;

import java.util.Scanner;

public class b1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int k = 0; k < m; k++) {
                arr[i][k] = str.charAt(k);

            }
        }


        int count = 1;
        char[][] bl = new char[8][8];
        char[][] wh = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int k = 0; k < 8; k++) {

                if (count % 2 + (i % 2) == 1) {
                    bl[i][k] = 'B';
                    wh[i][k] = 'W';
                } else {
                    bl[i][k] = 'W';
                    wh[i][k] = 'B';
                }
                count++;
            }
        }

        int max = 9999;
        int max2 = 9999;


        for (int i = 0; i < n; i++) {
            if (i + 7 < n) {
                for (int k = 0; k < m; k++) {
                    if (k + 7 < m) {

                        int index = 0;
                        int index2 = 0;
                        for (int s = 0; s < 8; s++) {
                            for (int c = 0; c < 8; c++) {
                                if (arr[i + s][k+c] != bl[s][c]) {
                                    index++;
                                }
                                if (arr[i + s][k+c] != wh[s][c]) {
                                    index2++;
                                }
                            }
                        }

                        if (index < index2) {
                            max = index;
                        } else {
                            max = index2;
                        }
                        if (max2 > max) {
                            max2 = max;
                        }
                    }
                }
            }


        }
        System.out.println(max2);
    }
}