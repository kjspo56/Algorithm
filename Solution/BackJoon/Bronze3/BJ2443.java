package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2443 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i<=N; i++){
            //공백찍기
            for(int j = 1; j<i; j++){
                System.out.print(" ");
            }
            for(int k = (2*N)-(i*2-1); k>0; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
