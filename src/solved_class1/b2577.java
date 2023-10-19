package solved_class1;

import java.util.Scanner;

public class b2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        int sum = a*b*c;
        String str = String.valueOf(sum);
        int[] intarr = new int[10];

        for(int i = 0; i<10; i++){
            intarr[i] = i;
        }
        int[] res = new int[10];

        for(int i = 0; i<str.length(); i++){
            int temp=str.charAt(i)-48;
            for(int j = 0; j<res.length; j++){
                if(intarr[j] == temp)
                    res[j]++;
            }
        }

        for(int i = 0; i<res.length; i++){
            System.out.println(res[i]);

        }


    }
}
