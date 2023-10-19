package backjun_step.step3_forwhile;

import java.util.Scanner;

public class b11022 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in   );
        int step = sc.nextInt();
        int[][] arr = new int[step][2];

        for (int i =0; i<step; i++){
          for (int j =0; j<2; j++){
             arr[i][j]=sc.nextInt();
            }
        }

        for (int i= 0; i<step; i++){
            System.out.print("Case #"+(i+1)+": "+arr[i][0]+" + "+arr[i][1]+" = "+(arr[i][0]+arr[i][1]));
            System.out.println();
        }

    }
}
