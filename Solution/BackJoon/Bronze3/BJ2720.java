package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T !=0) {
            int cost = Integer.parseInt(br.readLine()); //  거스름돈 액수

            int Q = cost/25;
            int D = (cost - Q * 25)/10;
            int N = (cost - Q * 25 - D * 10)/5;
            int P = cost- Q * 25 - D * 10 - N * 5;
            System.out.println(Q + " " + D + " " + N + " " + P);
            T--;
        }
    }
}
