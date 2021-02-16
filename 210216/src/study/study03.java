//백준 2588번
package study;

import java.util.Scanner;

public class study03 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
	//Scanner를 이용한 방법
// 		int a = sc.nextInt();
// 		String b = sc.next();
		
// 		sc.close();
		
// 		System.out.println(a * (b.charAt(2) - '0'));
// 		System.out.println(a * (b.charAt(1) - '0'));
// 		System.out.println(a * (b.charAt(0) - '0'));
// 		System.out.println(a * Integer.parseInt(b));
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(a * (b%10));
		sb.append('\n');
		
		sb.append(a * (b%100)/10);
		sb.append('\n');
		
		sb.append(a * (b/100));
		sb.append('\n');
		
		sb.append(a * b);
		
		System.out.print(sb);
		
	}
}
