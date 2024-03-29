package Bronze5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BJ2754 {
    public static void main(String[] args) {
        Map<String, Double> score = new HashMap<String, Double>();
        score.put("A+", 4.3);
        score.put("A0", 4.0);
        score.put("A-", 3.7);
        score.put("B+", 3.3);
        score.put("B0", 3.0);
        score.put("B-", 2.7);
        score.put("C+", 2.3);
        score.put("C0", 2.0);
        score.put("C-", 1.7);
        score.put("D+", 1.3);
        score.put("D0", 1.0);
        score.put("D-", 0.7);
        score.put("F", 0.0);

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        System.out.println(score.get(s));
    }
}
