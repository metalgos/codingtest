package solved_class2;

import java.math.BigInteger;
import java.util.Scanner;

public class b1676 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        BigInteger bigInteger = BigInteger.valueOf(1);


        for (int i = 1; i <= n; i++) {

            BigInteger temp=BigInteger.valueOf(i);

            bigInteger=bigInteger.multiply(temp);
        }

        String str = String.valueOf(bigInteger);

        int count = 0;
        for (int i = str.length() - 1; i > 0; i--) {

            int c = Character.getNumericValue(str.charAt(i));
            if (c == 0) {
                count++;
            }else {
                break;
            }

        }
        System.out.println(count);

    }
}
