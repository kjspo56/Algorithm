import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1000 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner((System.in));
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(a + b);
//        sc.close();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str,"");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a+b);

    }
}
