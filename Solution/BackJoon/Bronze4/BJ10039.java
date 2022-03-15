package Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10039 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        for (int i = 0; i<5; i++){
            int val = Integer.parseInt(br.readLine());
            sum += (val > 40) ? val : 40;   //val이 40보다 크면 val 거짓이면 40으로 값 지정
        }

        System.out.println(sum/5);
    }
}
