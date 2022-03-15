import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ13866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int team[] = new int[4];
        team[0] = A;
        team[1] = B;
        team[2] = C;
        team[3] = D;

        int sum = A + B + C + D;
        int min = 10000;

        for(int i = 0; i<4; i++) {
            for (int j = i + 1; j<4; j++){
                int gap = 0;
                int team1 = 0;
                int team2 = 0;
                team1 = team[i] + team[j];
                team2 = sum - team1;
                if(team1 < team2){
                    gap = team2 - team1;
                } else {
                    gap = team1 - team2;
                }
                min = Math.min(min, gap);
            }
        }
        System.out.println(min);
    }
}
