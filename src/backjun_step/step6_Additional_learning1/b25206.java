package backjun_step.step6_Additional_learning1;

import java.util.*;

public class b25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        double hak = 0;
        for (int i = 0; i < 20; i++) {


            String title = sc.next();
            double hakjum = sc.nextDouble();
            String grd = sc.next();
            double grade = 0;

            if (grd.equals("P")) {
                continue;
            }
            switch (grd) {
                case "A+":
                    grade = 4.5;
                    break;
                case "A0":
                    grade = 4.0;
                    break;
                case "B+":
                    grade = 3.5;
                    break;
                case "B0":
                    grade = 3.0;
                    break;
                case "C+":
                    grade = 2.5;
                    break;
                case "C0":
                    grade = 2.0;
                    break;
                case "D+":
                    grade = 1.5;
                    break;
                case "D0":
                    grade = 1.0;
                    break;
                case "F":
                    grade = 0;
                    break;
            }
            sum += hakjum * grade; //전공평점 합 = 학점 * 과목평점
            // System.out.println("sum : " +sum);
            hak += hakjum; //학점총합
            // System.out.println("hak : "+hak);
        }
        double result = sum/hak;
        System.out.printf("%.6f",result);
    }


}
