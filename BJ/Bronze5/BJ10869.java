//백준 10869번
package study;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class study01 {
	public static void main(String[] args) throws IOException {
		
		//Scanner 를 이용한 방법
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		sc.close();
//		
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
//몫		System.out.println(a/b);
//나머지	System.out.println(a%b);

		//BufferedWriter을 쓰는 방법
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		in.close();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write((a+b)+ "\n");
		bw.write((a-b)+ "\n");
		bw.write((a*b)+ "\n");
		bw.write((a/b)+ "\n");
		bw.write((a%b)+ "\n");
		
		bw.flush();
		bw.close();
	}
}
