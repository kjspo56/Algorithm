import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ23825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());   //S모양 블록 갯수
        int M = Integer.parseInt(st.nextToken());   //A모양 블록 갯수
        int temp = 0;

        temp = Math.min(N, M);
        System.out.println(temp/2);
    }
}
