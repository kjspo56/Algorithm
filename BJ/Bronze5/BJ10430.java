//10430번
package study;

import java.util.Scanner;

public class study02 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		in.close();
		
		System.out.println((a+b)%c);
		System.out.println((a%c + b%c)%c);
		System.out.println((a*b)%c);
		System.out.println((a%c*b%c)%c);
	}
}
