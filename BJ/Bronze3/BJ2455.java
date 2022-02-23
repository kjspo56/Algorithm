import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2455 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int now = 0;
        for(int i = 0; i<4; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int out = Integer.valueOf(st.nextToken());
            int in = Integer.valueOf(st.nextToken());

            now = now - out + in;
            max = Math.max(max, now);
        }
        System.out.println(max);
    }
}
