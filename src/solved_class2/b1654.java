package solved_class2;

import java.util.Scanner;

public class b1654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fstep = sc.nextInt();
        int lstep = sc.nextInt();

        int arr[] = new int[fstep];
        int na[] = new int[1000];

        int sum = 0;
        int min = 0;

        for (int i = 0; i<fstep;i++){
            int n  = sc.nextInt();
            arr[i] = n;
            sum+=n;
        }


        for (int i =1; i<na.length; i++){
            if(sum%i ==0){


            }
        }

    }

}
