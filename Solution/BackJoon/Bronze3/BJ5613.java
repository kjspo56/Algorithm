package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ5613 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = Integer.parseInt(br.readLine());   //이곳에서 계속 계산을 해준다.

        while(true){
            String S = br.readLine();

            //루프종료
            if(S.equals("=")) break;

            int N = Integer.parseInt(br.readLine());

            if(S.equals("+")) {
                result += N;
            } else if(S.equals("-")){
                result -= N;
            } else if(S.equals("*")){
                result *= N;
            } else {
                result /= N;
            }
        }
        System.out.println(result);
    }
}
