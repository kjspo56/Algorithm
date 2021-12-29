import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ10156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int K = Integer.parseInt(st.nextToken());   //과자 한 개 가격
        int N = Integer.parseInt(st.nextToken());   //과자의 개수
        int M = Integer.parseInt(st.nextToken());   //현재 가진 돈 액수

        int R = (K*N) - M;

        System.out.println((R<0) ? 0 : R);
        //if문을 사용할 경우에 걸리는 시간은 동일하나 메모리 크기는 삼항연산자가 조금 더 컸음.
    }
}
