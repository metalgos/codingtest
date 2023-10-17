package backjun_step.backjun_step5_String;

import java.util.Scanner;

public class b10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st =sc.next();


        int alpha[] = new int[24];
        int count =65;
        for (int k =0; k<alpha.length;k++){
            alpha[k] = count++;
        }


        for (int i =0; i<st.length();i++){
            int count2 =0;
            char c = st.charAt(i);




            for (int j =65; j<=99;j++){
                if(c==j){
                   count2 = i;

                }else{
                    count2= -1;
                }
                System.out.print(count2 + " ");
            }


        }

    }

}
