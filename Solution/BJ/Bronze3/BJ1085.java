import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int Xmin = Math.min(x, w-x);   //x축 최소거리
        int Ymin = Math.min(y, h-y);   //y축 최소거리

        //x와 y 최소거리 중 가장 작은 값
        System.out.println(Math.min(Xmin, Ymin));
    }
}
