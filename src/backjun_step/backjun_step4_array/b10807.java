package backjun_step.backjun_step4_array;

import java.util.Scanner;

public class b10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int step = sc.nextInt();
        int[] arr = new int[step];

        for (int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int count =0;
        int num = sc.nextInt();
        for (int i : arr){
            if(i==num){

                count++;
            }


        }
        System.out.println(count);

    }
}

