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

        for (int i = 0; i < step; i++) {
            flist.add(sc.nextInt());
        }
        Collections.sort(flist);  // 첫번째 리스트 소트
        int lstep = sc.nextInt();

        List<Integer> lalist = new ArrayList<>();

        for (int i = 0; i < lstep; i++) {
            lalist.add(sc.nextInt());
        }
        for (int i = 0; i < lstep; i++) {
            int result = binarysearch(flist, lalist.get(i));
            System.out.println(result);

        }


    }

    static int binarysearch(List<Integer> flist, int key) {

        int start = 0;
        int end = flist.size() - 1;


        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == flist.get(mid)) {
                return 1;

            } else if (key > flist.get(mid)) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }

            //System.out.print(start + " " + end);
        }


        return 0;
    }


}
