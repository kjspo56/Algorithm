package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i<T; i++) {
            String[] temp = br.readLine().split(" ");

            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);

            int result = 1;

            for (int j = 1; j <=b; j++){
                result = result * a % 10;
            }

            //0일 경우 10으로 처리
            result = result == 0 ? 10 : result;
            System.out.println(result);
        }
        br.close();
    }
}
