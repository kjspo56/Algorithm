import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ4299 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());   //경기 결과 합
        int d = Integer.parseInt(st.nextToken());   //경기 결과 차
        int a;   //득점 점수
        int b;   //득점 점수

        if ( s < d) {   //합이 차보다 작을 수는 없음
            System.out.println("-1");
        } else {
            if (d==0) {
                a = s / 2;
                b = s / 2;
            } else if (s % 2 == 0) {    //합과 차가 짝수인 경우
                a = (s / 2) + (d / 2);
                b = (s / 2) - (d / 2);
            } else {    //합과 차가 홀수인 경우
                int temp = s + 1;
                a = (temp / 2) + (d / 2);
                b = (temp / 2) - (d / 2) - 1;
            }
            if ((a+b) == s && (a-b) == d) {
                System.out.print(a+" ");
                System.out.println(b);
            } else {
                System.out.println("-1");
            }
        }
    }
}
