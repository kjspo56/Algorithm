package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2953 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;    //최대값을 저장할 변수
        int n = 0;  //몇번째 사람인지 저장할 변수

        for(int i = 0; i<5; i++){   //다섯명의 사람 측정
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0; //점수들의 합
            for(int j =0; j < 4; j++) {//점수들의 합을 sum에 계속 저장한다.
                sum += Integer.parseInt(st.nextToken());
            }
            if(max < sum) { //max가 sum보다 작을 경우에 sum값을 n에 i+1형태로 저장한다.
                max = sum;
                n = i + 1;
            }
        }
        System.out.println(n + " " + max);
    }
}
