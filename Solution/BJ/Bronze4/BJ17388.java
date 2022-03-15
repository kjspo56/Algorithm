import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ17388 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int S = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        int i[] = {S, K, H};
        Arrays.sort(i);

        if(S + K + H >= 100) System.out.println("OK");
        else if (i[0]==S) System.out.println("Soongsil");
        else if (i[0]==K) System.out.println("Korea");
        else System.out.println("Hanyang");
    }
}
