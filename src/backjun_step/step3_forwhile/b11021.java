package backjun_step.step3_forwhile;

import java.util.Scanner;

public class b11021 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in   );
        int step = sc.nextInt();
        int[] arr = new int[step];

        for (int i =0; i<arr.length; i++){
            int a=sc.nextInt();
            int b= sc.nextInt();

            arr[i]=a+b;
        }
        for (int i= 0; i<arr.length; i++){
            System.out.println("Case #"+(i+1)+": "+arr[i] );
        }
    }
}
