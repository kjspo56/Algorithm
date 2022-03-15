import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ10707 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //X사
        int A = Integer.parseInt(br.readLine());    //X사의 1리터당 요금

        //Y사
        int B = Integer.parseInt(br.readLine());    //Y사의 기본요금
        int C = Integer.parseInt(br.readLine());    //Y사의 요금이 기본요금이 되는 사용량의 상한
        int D = Integer.parseInt(br.readLine());    //Y사의 1리터당 추가요금

        int P = Integer.parseInt(br.readLine());    // JOI군 집에서 사용하는 한달간 수도의 양

        for(int i =0; i<(Math.max(P - C, 0)); i++) {
            B += D;
        }
        System.out.println(Math.min((A*P), B));

    }
}
