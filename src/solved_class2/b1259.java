package solved_class2;

import java.util.Scanner;

public class b1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = "";
        while (true) {
            n = sc.nextLine();
            if (n.equals("0"))
                break;
            String arr[] = new String[n.length()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = String.valueOf(n.charAt(i));
            }
            boolean result = true;
            for (int i = 0; i < arr.length; i++) {
                if (!arr[i].equals(arr[arr.length - i - 1])) {
                    System.out.println("no");
                    result= false;
                    break;
                }

            }
            if (result) {
                System.out.println("yes");
            }


        }


    }
}
