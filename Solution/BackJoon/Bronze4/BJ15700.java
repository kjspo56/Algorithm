package Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BJ15700 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        BigInteger big1 = new BigInteger(st.nextToken());
        BigInteger big2 = new BigInteger(st.nextToken());

        BigInteger big3 = big1.multiply(big2);
        BigInteger big4 = new BigInteger("2");

        System.out.println(big3.divide(big4));
    }
}
