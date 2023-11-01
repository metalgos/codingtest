package solved_class2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class b1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> flist = new ArrayList<>();


        int step = sc.nextInt();
        //nt[] first = new int[step];
        for (int i = 0; i < step; i++) {
            //irst[i] = sc.nextInt();
            flist.add(sc.nextInt());


        }
        Collections.sort(flist);  // 첫번째 리스트 소트


        int lstep = sc.nextInt();
        //int[] last = new int[lstep];
        List<Integer> lalist = new ArrayList<>();

        for (int i = 0; i < lstep; i++) {
            //ast[i] = sc.nextInt();
            lalist.add(sc.nextInt());


        }
        int start = 0;
        int end = flist.size() - 1;
    }


}
