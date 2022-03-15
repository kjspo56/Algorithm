import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ2506 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int [] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int sum = 0;
        for(int i = 0; i < N; i++){
            if(arr[i] == 1) {
                count++;
                sum+=count;
                //연셕된 수를 체크하면서 연속될 경우
                //count를 하나씩 더해주어
                //sum에 더해준다.
            } else {
                count = 0;
                //연속된값 체크시 후 연속되지 않을 경우
                //0으로 초기화 하여 검색한다.
            }
        }
        System.out.println(sum);
    }
}
