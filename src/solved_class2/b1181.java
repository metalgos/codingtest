package solved_class2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class b1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashSet<String> uni = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String temp = sc.nextLine();
            uni.add(temp);
        }

        // 중복을 제거한 문자열을 배열에 복사
        String[] arr = new String[uni.size()];
        uni.toArray(arr);


        String temp = "";

        for (int k = 0; k < arr.length; k++) {
            for (int i = k; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j]+ " ");
                }
                System.out.println();
                    if (arr[k].length() > arr[i].length()) {

                        temp = arr[k];
                        arr[k] = arr[i];
                        arr[i] = temp;
                        System.out.println("ar1 : " + arr[k]+" ar2 ; "+arr[i]);

                    }
            }
        }
        //Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }


}
