package Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ17362 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int answer = A % 8; //나누기 8에 따라 나오는 값들이 달라짐

        System.out.println(answer == 0 ? 2 : answer == 6 ? 4 : answer == 7 ? 3 : answer);

    }
}
