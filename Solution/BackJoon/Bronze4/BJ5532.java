package Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ5532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int L = Integer.parseInt(st.nextToken());   //방학 총 일수
        int A = Integer.parseInt(st.nextToken());   //국어 총 페이지
        int B = Integer.parseInt(st.nextToken());   //수학 총 페이지
        double C = Integer.parseInt(st.nextToken());   //하루에 풀 수 있는 국어 최대 페이지
        double D = Integer.parseInt(st.nextToken());   //하루에 풀 수 있는 수학 최대 페이지

        int korean = (int) Math.ceil(A / C);    //국어를 최대한 풀 수 있는 날
        int math = (int) Math.ceil(B / D);  //수학을 최대한 풀 수 있는 날

        int day = 0;
        if(korean>math){
            day = korean;
        } else {
            day = math;
        }

        System.out.println(L - day);
    }
}
