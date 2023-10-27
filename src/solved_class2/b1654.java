package solved_class2;

import java.util.Scanner;

public class b1654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fstep = sc.nextInt();
        long lstep = sc.nextInt();

        int arr[] = new int[fstep];

        int max = 0;

        long count = 0;
        long result = 0;

        for (int i = 0; i < fstep; i++) {
            int n = sc.nextInt();
            arr[i] = n;


            if (max < arr[i]) {
                max = arr[i];

            }

        }
        int k = 1;
        if(max!=0){
            k=max/2;
        }


        lp1:


        for (; k < max;) {
            long temp = result;

            for (int i = 0; i < arr.length; i++) {

                count += arr[i] / k;
                result = k;

            }


            if (count < lstep) {

                System.out.println(temp);

                break lp1;
            }
            count = 0;
        }


    }

}
