package solved_sprout;

import java.util.Scanner;

public class b2754 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char a = 'F';
        char b = '0';
        if(str.length()>1) {
           a = str.charAt(0);
           b = str.charAt(1);
        }
        else{
            a = str.charAt(0);
            b = '0';
        }
        double pl = 0;
        double fl = 0;

        if (b == '+') {
            pl = 0.3;
        } else if (b == '0') {
            pl = 0;
        } else {
            pl = -0.3;
        }
        if (a == 'A') {
            fl = 4;
        } else if (a == 'B') {
            fl = 3;
        } else if (a == 'C') {
            fl = 2;
        } else if (a == 'D') {
            fl = 1;
        } else {
            fl = 0;
            pl = 0;
        }

        System.out.printf("%.1f",fl+pl);

    }
}
