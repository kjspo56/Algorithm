import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ20492 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 상금금액

        double a = (N - (N*0.22)); //전체상금 제세공과금 22%
        double b = N*0.8 + ((N*0.2) - ((N*0.2) * 0.22)); //상금 80% 경비인정, 나머지 22% 제세공과금
        System.out.println((int)a);
        System.out.println((int)b);
    }
}
