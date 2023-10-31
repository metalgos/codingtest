package solved_class2;

import java.util.Scanner;

public class b1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int step = sc.nextInt();
        int[] first = new int[step];
        for (int i = 0; i < step; i++) {
            first[i] = sc.nextInt();


        }


        int lstep = sc.nextInt();
        int[] last = new int[lstep];

        for (int i = 0; i < lstep; i++) {
            last[i] = sc.nextInt();


        }

        boolean count = true;

        for (int i = 0; i < step; i++) {
            for (int k = 0; k < lstep; k++) {
                if(first[k]==last[i]){
                    System.out.println(1);


                    count = false;
                    break;
                }

            }
            if(count){
                System.out.println(0);

            }
            count = true;
        }


    }
}
