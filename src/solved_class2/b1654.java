package solved_class2;

import java.util.Scanner;

public class b1654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        long N = sc.nextInt();


        long result = 0;
        long max = 0;

        long[] arr = new long[K];
        for (int i = 0; i < K; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }

        long k = 1;
        if (max != 0) {
            k = max / 2;
        }


        long half = 0;
        long min = 1;

        while (min <= max) {
            half = (min + max) / 2;
            long count = 0;

            for (long num : arr) {
                count += num / half;
            }

            // 원하는 랜선 갯수 보다 잘라진 랜선 수가 적을경우
            // 하나의 랜선 길이가 길어서 길이를 더 짧게 만들어야 함
            // half보다 아래의 수.
            if (count < N) {
                max = half - 1;
            }
            // 원하는 랜선 갯수 보다 잘라진 랜선 수가 많을경우
            // 하나의 랜선 길이가 짧아서 더 길게 만들어야 함
            // half보다 위의 수에 있음.
            else {
                min = half + 1;
            }
        }

        System.out.println((max + min) / 2);
    }


}

