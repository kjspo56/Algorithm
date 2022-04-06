package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2903 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    //입력값

        int first = 2;  //처음값
        int result = 0;
        for(int i = 0; i<N; i++){
            first += (int)(Math.pow(2,i));
        }
        System.out.println((int)(Math.pow(first,2)));
    }
}
