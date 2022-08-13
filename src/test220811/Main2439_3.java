package test220811;
//[백준/JAVA] 2439번 별 찍기 - 2 
import java.util.Scanner;
public class Main2439_3 {
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			for (int j=0; j<N; j++) {
				
                if(j<(N-i)) {
					System.out.print(" ");	
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

//출력형식이 잘못되었습니다 i=1 부터 시작 j = 0부터 시작. (i, j 숫자 범위 설정이 어려웠음)