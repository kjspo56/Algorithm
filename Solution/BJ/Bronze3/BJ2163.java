import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2163 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [][] DP = new int[N+1][M+1];

        for (int i=1; i<=N; i++){
            for(int j=1; j<=M; j++){
                if( i==1) DP[i][j] = j-1;
                else if (j==1) DP[i][j] = i - 1;
                else DP[i][j] = DP[i][j/2] + DP[i][j-j/2] + 1;
            }
        }
        System.out.println(DP[N][M]);
    }
}
