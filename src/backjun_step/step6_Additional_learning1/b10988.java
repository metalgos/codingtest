package backjun_step.step6_Additional_learning1;

import java.util.Scanner;

public class b10988 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        int index = str.length()/2;
        boolean result = true;
        for (int i =0; i<str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                result = false;
                break;
            }

        }
        if (result){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
