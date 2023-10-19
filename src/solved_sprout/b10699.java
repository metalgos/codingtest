package solved_sprout;

import java.time.LocalDate;
import java.time.ZoneId;

public class b10699 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        LocalDate seoul = LocalDate.now(ZoneId.of("Asia/Seoul"));

        System.out.println(seoul);
    }
}
