package backjun_step.backjun_step4_array;

import java.util.Scanner;

public class b5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] arr = new int[30];
        for (int i=0; i<30;i++){
            arr[i] = 99;
        }

        for (int i=0; i<28;i++){
            int n = sc.nextInt();
            arr[n-1]=1;
        }

        for (int i=0; i<30;i++){
            if(arr[i]==99){
                System.out.println(i+1);
            }
        }




    }

}
