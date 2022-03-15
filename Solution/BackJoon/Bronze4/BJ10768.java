package Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10768 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Month = Integer.parseInt(br.readLine());    //월 입력
        int Day = Integer.parseInt(br.readLine());    //달 입력

        if (Month < 2){
            System.out.println("Before");
        } else if (Month == 2) {
            if(Day < 18) {
                System.out.println("Before");
            } else if(Day > 18) {
                System.out.println("After");
            } else {
                System.out.println("Special");
            }
        } else {
            System.out.println("After");
        }
    }
}
