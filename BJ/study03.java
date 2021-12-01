//백준 10171번
package study;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class study03 {
	public static void main(String[] args) throws IOException {
//		System.out.println("\\   /\\");
//		System.out.println(" )  ( ')");
//		System.out.println("(  /  )");
//		System.out.println(" \\(__)|");
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("\\   /\\");
		bw.newLine(); //줄 구분자bw.write(cbuf);
		
		bw.write(" )  ( ')");
		bw.newLine();
		
		bw.write("(  /  )");
		bw.newLine();
		
		bw.write(" \\(__)|");
		
		bw.flush();
		bw.close();
	}
}
