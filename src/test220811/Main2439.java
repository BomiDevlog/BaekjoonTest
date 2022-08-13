package test220811;
//[백준/JAVA] 2439번 별 찍기 - 2
import java.util.*;
public class Main2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N=sc.nextInt();
		
		for(int i=1;i<=N;i++) {//입력 값만큼 줄 생성
			for(int k=0;k<N-i;k++)
				System.out.print(" ");//'입력값-줄 번호'만큼 빈칸
			for(int j=1;j<=i;j++) {
			System.out.print("*");//줄 번호 만큼 별 출력
			}
		
		System.out.println();
		}
			
		
		
		
	}

	

}

//출력 초과: 출력에 요구되지 않는 값들이나, 공백이 들어갔을 때 발생하는 오류
//출력 형식이 잘못되었습니다