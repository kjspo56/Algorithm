package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BJ1864 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String a = br.readLine();
            ArrayList<Character> list = new ArrayList<Character>();

            for (int i = a.length() - 1; i >= 0; i--) {
                if (a.charAt(i) == '#') {
                    return;
                }
                list.add(a.charAt(i));
            }

            int result = 0;
            for (int i = 0; i < list.size(); i++) {

                switch (list.get(i)) {
                    case '-':
                        result += 0;
                        break;
                    case '(':
                        result += 2 * Math.pow(8, i);
                        break;
                    case '@':
                        result += 3 * Math.pow(8, i);
                        break;
                    case '?':
                        result += 4 * Math.pow(8, i);
                        break;
                    case '>':
                        result += 5 * Math.pow(8, i);
                        break;
                    case '&':
                        result += 6 * Math.pow(8, i);
                        break;
                    case '%':
                        result += 7 * Math.pow(8, i);
                        break;
                    case '/':
                        result += -1 * Math.pow(8, i);
                        break;
                    default:    // '\' 는 case에 지정이 안돼서 default값일 때를 1로 두고 처리함
                        result += Math.pow(8, i);
                        break;
                }
            }
            System.out.println(result);
        }
    }
}
