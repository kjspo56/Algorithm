package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BJ2061 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " " );

        BigInteger K = new BigInteger(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        boolean [] prom = new boolean[L + 1];
        prom[1] = true;

        for(int i = 2; i < L ; i++) {
            if(prom[i]) continue;   //소수가 아닌(true)는 넘기기
            BigInteger now = new BigInteger(Integer.toString(i));
            if(K.mod(now).compareTo(BigInteger.ZERO) == 0) {    //p를 now로 나눈 나머지가 0이면
                System.out.println("BAD " + now);
                return;
            }
            for(int j = i + i ; j <= L; j+=i){ //i를 제외한 i의 배수 모두 체크
                prom[j] = true;
            }
        }
        System.out.println("GOOD");
    }
}
