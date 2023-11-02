package solved_class2;

import java.util.Arrays;

import java.util.Scanner;

public class b1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean[] prime = new boolean[m+1];

        Arrays.fill(prime,true);
        isprime(prime);

        for (int i =n ; i<=m; i++){
            if(prime[i]){
                System.out.println(i);
            }

        }

    }


    static void isprime(boolean[] prime) {

        prime[0] = prime[1] = false;  // 0,1은 소수가 아님

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {       //제곱근으로 제한

            if (!prime[i]) {  // 이미 false로 판정됬으면
                continue;
            }

            for (int k = i + i; k < prime.length; k = k + i) {     // 4,6,8   6 9 12  8 12 16  2의 배수 3의배수 4의배수.. 전부  ture
                prime[k] = false;
            }
        }

    }


}


