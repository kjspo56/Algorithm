package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2010 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        //무조건 1개의 컴퓨터에는 결합 할 수 있으므로 초기값은 1
        int cnt = 1;

        for(int i = 0; i < N; i++){
            cnt += Integer.parseInt(br.readLine());
        }

        //멀티탭 N을 결합한 개수만큼 빼기. 멀티탭이 사용한 자리는 한번 낄때마다 하나씩 사용하기때문에 반복 횟수만큼 -1해주면 되니
        //N을 뺴주면 된다.
        cnt -= N;
        System.out.println(cnt);
        br.close();
    }
}
