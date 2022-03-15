package Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ14264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Double L = Double.parseDouble(st.nextToken());

        //삼각형 면접 구하는 공식 루트3 * 1/4 * L값 제곱
        System.out.println(Math.sqrt(3)*0.25*Math.pow(L,2));


    }
}
