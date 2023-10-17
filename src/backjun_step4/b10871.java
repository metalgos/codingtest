package backjun_step4;

import java.util.Scanner;

public class b10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int step = sc.nextInt();


        int n = sc.nextInt();

        int[] arr = new int[step];

        for (int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i]<n){
                System.out.printf(arr[i]+" ");
            }
        }


    }
}
