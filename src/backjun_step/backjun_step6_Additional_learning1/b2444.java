package backjun_step.backjun_step6_Additional_learning1;

import java.util.Scanner;

public class b2444 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for (int k =0; k<n; k++) {
            for (int i = n - k-1 ; i > 0; i--) {
                System.out.print(" ");

            }
            for (int j = 0; j < 2*k+1; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
        for (int k =1;  k<n; k++) {
            for (int i = 0; i <k ; i++) {
                System.out.print(" ");
            }
            for(int j= 2*(n-k)-1; j>0; j--){
                System.out.print("*");
            }
            System.out.println();

        }



    }
}
