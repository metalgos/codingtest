package backjun_step.backjun_step4_array;

import java.util.*;

public class b3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        Set<Integer> set1 = new HashSet<>();

        for (int i=0; i<10;i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<10;i++){
            set1.add(arr[i]%42);
        }




        System.out.println( set1.size());

    }
}
