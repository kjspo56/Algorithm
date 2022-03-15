package Bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ15727 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int L = Integer.parseInt(st.nextToken()); //성우의 현재 위치와 민건이집까지의 거리
        if(L%5==0) {
            System.out.println(L/5);
        } else {
            System.out.println(L/5+1);
        }

    }
}
