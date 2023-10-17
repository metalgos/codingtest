package backjun_step4;

import java.util.Scanner;

public class b10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int step = sc.nextInt();

        int[] arr = new int[step];
        arr[0] = sc.nextInt();
        int max =arr[0],min=arr[0];

        for (int i =1; i<arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i]<min){
                min = arr[i];
            }else if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(min + " "+max);


    }
}
