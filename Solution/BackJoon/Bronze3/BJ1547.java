package Bronze3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1547 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());

        int cup[] = {0, 1, 0,0};

        for(int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int temp = cup[x];
            cup[x] = cup[y];
            cup[y] = temp;
        }
        for(int i = 0; i < 4; i++){
            if(cup[i] == 1) {
                System.out.println(i);
                return;
            }
        }
    }
}
