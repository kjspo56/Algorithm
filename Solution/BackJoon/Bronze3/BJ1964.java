package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1964 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int Div = 45678;
        int result = 5;

        for(int i = 1; i< N; i++) {
            result = (result + (i + 2) * 3 - 2) % Div;
        }

        System.out.println(result);
        br.close();
    }
}
