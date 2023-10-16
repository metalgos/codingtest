package backjun_step3;

import java.util.Scanner;

public class b10950 {
    /*두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
각 테스트 케이스마다 A+B를 출력한다.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int step = sc.nextInt();

        int[][] arr = new int[step][2];
        int[] result = new int[step];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();

            }
        }

        for (int i = 0; i < step; i++) {
            int sum = 0;
            for (int j = 0; j < 2; j++) {
                sum += arr[i][j];
            }


            result[i] = sum;
            System.out.println(sum);

        }

    }

}
