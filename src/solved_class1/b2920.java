package solved_class1;


import java.util.Scanner;

public class b2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intar = new int[8];
        int[] asc = new int[8];
        int[] des = new int[8];


        for(int i=0; i<8;i++){
            int b= sc.nextInt();
            intar[i] = b;
        }
        //b 15856
        for(int i=0; i<8;i++){
            asc[i] = i+1;
        }
        int count =0;
        for(int i=7; i>=0; i--){
            des[count] = i+1;
            count++;
        }


        int ascount =0;
        int descount =0;

        for(int i=0; i<8;i++){
           if(intar[i]==asc[i]){

                ascount++;
           }else if(intar[i]==des[i]){

               descount++;
           }

        }

        if(ascount==8){
            System.out.println("ascending");
        }else if(descount==8){
            System.out.println("descending");
        }else
            System.out.println("mixed");


    }
}
