package solved_class2;

import java.util.Scanner;

public class b1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int step = sc.nextInt();

        int num = 665;
        int sum = 0;
        String str = "";

        while (true) {
            num++;
            str = String.valueOf(num);

            for (int i = 0; i < str.length() - 2; i++) {

                if (str.charAt(i) == '6' && str.charAt(i + 1) == '6' && str.charAt(i + 2) == '6')  {
                    sum++;
                    i = str.length();
                }
            }

            if (sum == step) {
                break;
            }
        }

        System.out.println(num);

    }

}

