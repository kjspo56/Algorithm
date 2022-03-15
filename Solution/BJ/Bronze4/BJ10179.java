import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10179 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Case = Integer.parseInt(br.readLine()); // 테스트 케이스 수
        double []arr = new double[Case];

        for(int i = 0; i < Case; i++){
            arr[i] = Double.parseDouble(br.readLine());
            double sum = arr[i] * 80 / 100; //20% 할인이니깐 80 곱하고 100으로 나누기 해준다.
            System.out.println("$" + String.format("%.2f", sum));   //String format을 통해 소수점 둘째 표현
        }

    }
}
