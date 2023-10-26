package solved_class2;

import java.util.Scanner;

public class b1654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fstep = sc.nextInt();
        int lstep = sc.nextInt();

        int arr[] = new int[fstep];

        int min = 100000;

        int count = 0;
        int result =0;

        for (int i = 0; i < fstep; i++) {
            int n = sc.nextInt();
            arr[i] = n;


            if (min > arr[i]) {
                min = arr[i];

            }
            System.out.println("loop : " + i);
        }
        lp1:
        while (true) {

            for (int k = min; k > 1; k--) {

                System.out.println(k);
                for (int i = 0; i < arr.length; i++) {

                    count += arr[i] / k;
                    result = k;

                }


                if (count >= lstep) {

                    System.out.println(result);

                    break lp1;
                }
                count = 0;
            }



        }




    }

}
