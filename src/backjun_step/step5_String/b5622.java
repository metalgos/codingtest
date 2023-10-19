package backjun_step.step5_String;

import java.util.Scanner;

public class b5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        int inum[] = new int[st.length()];

        for (int i =0; i<st.length(); i++){
            if(st.charAt(i)==90){
                inum[i] =10;
            }else if(st.charAt(i)>=83){
                inum[i] = (st.charAt(i) - 66) / 3 + 3;
            }
            else {
                inum[i] = (st.charAt(i) - 65) / 3 + 3;
            }
        }

        int sum=0;
        for (int i =0; i<inum.length; i++){
            sum += inum[i];
        }
        System.out.println(sum);



    }
}
