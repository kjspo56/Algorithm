import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        br.close();

        for(int i = 1; i<10; i++){
            System.out.println(A + " * " + i + " = " + (A*i));
        }
    }
}
