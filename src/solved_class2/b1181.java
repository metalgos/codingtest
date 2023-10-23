package solved_class2;

import java.util.*;

public class b1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < n; i++) {
            String temp = sc.nextLine();
            map.put(temp, "");
        }


        ArrayList<String> list = new ArrayList<String>(map.keySet());

        Collections.sort(list, new Comparator<String>() {
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }

                return 0;
            }
        });

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }


}
