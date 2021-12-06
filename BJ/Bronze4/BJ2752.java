import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BJ2752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

      int[] arr = new int[3];
      arr[0] = Integer.parseInt(st.nextToken());
      arr[1] = Integer.parseInt(st.nextToken());
      arr[2] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        for (int i = 0; i<3; i++){
            if(i<2){
                System.out.print(arr[i]+" ");
            } else {
                System.out.print(arr[i]);
            }
        }


    }
}