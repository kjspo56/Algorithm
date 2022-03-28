package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BJ2935 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger N = new BigInteger(br.readLine());

        char C = br.readLine().charAt(0);
        BigInteger M = new BigInteger(br.readLine());

        if( C == '*') {
            System.out.println(N.multiply(M));
        } else {
            System.out.println(N.add(M));
        }
    }
}
