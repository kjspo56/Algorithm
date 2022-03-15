package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BJ1837 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger P = new BigInteger(st.nextToken());  //암호P

        int K = Integer.parseInt(st.nextToken());   //암호 K

        boolean[] promise = new boolean[K + 1];
        promise[1] = true;


        /*
        소수를 구할때, 에라토스테네스의 체를 사용. 2부터 시작하여 소수의 배수를 모두 걸러냄.
         */
        for(int i = 2; i < K; i++) {
            if (promise[i]) continue; //소수가 아닌(true)는 수는 넘어가기기
            BigInteger now = new BigInteger(Integer.toString(i));
            if (P.mod(now).compareTo(BigInteger.ZERO) == 0) {    // p를 now로 나눈 나머지가 0이면,
                System.out.println("BAD " + now);
                return;
            }
            for (int j = i + i; j <= K; j += i) { //i를 제외한 i의 배수 체크
                promise[j] = true;
            }
        }
        System.out.println("GOOD");
    }
}
