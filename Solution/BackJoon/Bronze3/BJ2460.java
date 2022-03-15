package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0; //사람 제일 많을때 최대값
        int now = 0; //기차역에 남아있는 사람들 수

        for(int i = 0 ; i<10; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                int out = Integer.parseInt(st.nextToken()); //내리는 사람들
                int in = Integer.parseInt(st.nextToken());  //탑승하는 사람들

            now = now - out + in;
            max = Math.max(now, max);

        }
        System.out.println(max);
    }
}
