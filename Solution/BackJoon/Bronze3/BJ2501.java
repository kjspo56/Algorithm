package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //N, K
        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        //약수를 담을 배열
        int[] array = new int[N+1];

        //배열의 인덱스
        int index = 0;

        //N만큼 반복문을 수행
        for(int i = 1; i <= N; i++){
            if(N%i == 0) {
                array[index] = i;
                index++;
            }
        }
        //K번째로 작은 약수를 출력
        System.out.println(array[K-1]);
    }
}
