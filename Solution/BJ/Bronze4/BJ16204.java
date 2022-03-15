import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ16204 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //전체 개수
        int N = Integer.parseInt(st.nextToken());
        //앞면이 O인 카드
        int M = Integer.parseInt(st.nextToken());
        //뒷면이 X인 카드
        int K = Integer.parseInt(st.nextToken());

        //양면이 O인카드
        int O = Math.min(M, K);
        //양면이 X인 카드
        int X = Math.min(N-M, N-K);
        //양면이 같은 카드
        System.out.println(O + X);
    }
}
