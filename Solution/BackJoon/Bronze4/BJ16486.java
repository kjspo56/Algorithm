package Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ16486 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double d1 = Double.parseDouble(br.readLine());
        double d2 = Double.parseDouble(br.readLine());

        double sq = d1 * 2; //가로길이 * 2
        double circle = 2 * d2 * 3.141592;  //원의 둘레

        System.out.println(sq + circle);

    }
}
