//백준 1002번
package study;

import java.util.Scanner;

public class study03 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		while (T>0) {
			
			int x1 = in.nextInt();
			int y1 = in.nextInt();
			int r1 = in.nextInt();
			
			int x2 = in.nextInt();
			int y2 = in.nextInt();
			int r2 = in.nextInt();
			
			System.out.println(point(x1, y1, r1, x2, y2, r2));
		}
	}

	//접점 개수 구하는 함수
	public static int point(int x1, int y1, int r1, int x2, int y2, int r2) {
		
		int distance_pow =(int)(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)); // 중점간 거리의 제곱
		
		//case 1: 중점이 같으면서 반지름도 같을때
		if(x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
		}
		
		//case 2-1: 두 원의 반지름의 합보다 중점간 거리가 더 길때
		else if(distance_pow>Math.pow(r2+r1, 2)) {
			return 0;
		}
		
		//case 2-2: 원 안에 원이 있으나 내접하지 않을때
		else if(distance_pow<Math.pow(r2-r1, 2)) {
			return 0;
		}
		
		//case 3-1: 내접할때
		else if(distance_pow == Math.pow(r2-r1, 2)) {
			return 1;
		}
		
		//case 3-2 : 외접 할떄
		else if(distance_pow == Math.pow(r1+r2, 2)) {
			return 1;
		}
		
		else {
			return 2;
		}
		
		
	}
}
