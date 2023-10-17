package backjun_step.backjun_step3_forwhile;

import java.util.Scanner;

public class b2439 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in   );
        int step = sc.nextInt();

        for (int i =1; i<=step; i++){
            for (int j =i; j<step; j++){
                System.out.print(" ");
            }
            for (int j = step-i; j<step; j++){
                System.out.print("*");
            }

            if(i!=step){
                System.out.println();
            }

        }
    }
}

