package solved_class2;

import java.util.*;

public class b1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int step = sc.nextInt();

        int[] last = new int[step];
        List<Integer> list = new ArrayList<>();
        List<String> result = new ArrayList<>();

        //초기 배열에 1부터 n 순서대로 넣기 12345
        for (int i = 0; i <= step; i++) {
           list.add(i);
        }

        //입력받은 숫자를 넣기
        for (int i = 0; i < step; i++) {
            last[i] = sc.nextInt();
        }

        try {


        int count =0;
        for (int i = 0; i < step; i++) {
            while (true) {
                if (list.get(count) < last[i]) {
                    count += 1;
                    result.add("+");


                }else if(list.get(count) >= last[i]){
                    result.add("-");
                    list.remove(count);
                    count--;
                    break;
                }
            }
        }

        for(String i : result){
            System.out.println(i);
        }
        }catch (Exception e){
            System.out.println("NO");

        }
    }
}
