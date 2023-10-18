package backjun_step.backjun_step6_Additional_learning1;

import java.util.Scanner;

public class b1157 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();

        String st = str.toUpperCase();
        char result='?';

        int arr[] = new int[26];

        for (int i =0; i<st.length(); i++){
            arr[st.charAt(i)-65] += 1;
        }

        for(int i =0; i< arr.length; i++){

        }

        int max = 0;
        int index =0;

        for (int i =0; i<arr.length; i++){
            if ( max < arr[i]){
                max = arr[i];
                index = i;
            }
            result = (char)(index+65);

        }
        for (int i =0; i<arr.length; i++){
            if ( max == arr[i] && index !=i){
                result = '?';
                break;
            }
        }

        System.out.println(result);


    }
}
