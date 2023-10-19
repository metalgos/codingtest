package solved_sprout;

import java.util.Scanner;

public class b2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String up = sc.nextLine();

        String result = "";

        for (int i =0; i<up.length();i++){
            if(up.charAt(i)<97){
                String temp =String.valueOf(up.charAt(i)) ;
                String str = temp.toLowerCase();
                result += str;
            }else {
                    String temp =String.valueOf(up.charAt(i)) ;
                    String str = temp.toUpperCase();
                    result += str;


            }
        }
        System.out.println(result);


    }

}
