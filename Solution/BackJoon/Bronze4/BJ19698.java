package Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ19698 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());   //소들의 수
        int W = Integer.parseInt(st.nextToken());   //헛간의 크기 너비
        int H = Integer.parseInt(st.nextToken());   //헛간의 크기 높이
        int L = Integer.parseInt(st.nextToken());   //공간의 크기

        System.out.println(Math.min((W/L)*(H/L), N));


    }
}
