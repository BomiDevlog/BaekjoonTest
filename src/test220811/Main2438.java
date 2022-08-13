package test220811;
//[백준/JAVA] 2438번 별 찍기 - 1
import java.util.*;
public class Main2438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N=sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}


}
