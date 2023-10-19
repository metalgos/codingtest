package solved_class1;

import java.util.Scanner;

public class b8958 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int step = sc.nextInt();
        sc.nextLine();

        for (int k = 0; k<step; k++) {
            String str =sc.nextLine();
            char[] ch = str.toCharArray();

            int count = 0;
            int sum = 0;
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == 'O') {
                    count++;
                    sum += count;
                }
                else {

                    count = 0;
                }
            }
            System.out.println(sum);
        }

    }
}
