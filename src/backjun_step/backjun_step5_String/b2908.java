package backjun_step.backjun_step5_String;

import java.util.Scanner;

public class b2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int last = sc.nextInt();

        String fs = String.valueOf(first);
        String ls = String.valueOf(last);

        String temp = "";
        for (int i = fs.length() - 1; i >= 0;
             i--) {
            temp = temp + fs.charAt(i);
        }
        fs = temp;
        temp = "";
        for (int i = ls.length() - 1; i >= 0;
             i--) {
            temp = temp + ls.charAt(i);
        }
        ls = temp;
        first = Integer.valueOf(fs);
        last = Integer.valueOf(ls);
        if(last>first){
            System.out.println(last);
        }else{
            System.out.println(first);
        }

    }
}
