package test220816;
//[백준/자바] 2775번 부녀회장이 될테야
//https://www.acmicpc.net/problem/2775
import java.util.*;
public class Main2775 {
	public static void main(String[] args) {
		
		int apt[][] = new int [15][15]; //2차원배열 생성 : 15층 15호 아파트 구성
		
		for(int i=0; i<apt.length;i++) {// 0층 주민들 값저장. 
			apt[0][i]=i; 
		}
		
		//이차원 배열에 입주민 값 저장 (1층 1호부터 ~ 15층 15호까지)
		for (int i=1; i<apt.length; i++) { 
			int former=0;//전 호수 거주민
			
			for(int j=1; j<apt[i].length; j++) {
				apt[i][j]=apt[i-1][j] + former; 
				//각 호수의 거주민 = 아래 층의 같은 호수 거주민 +전 호수의 거주민
				former=apt[i][j];
			}
		}
		
		Scanner sc=new Scanner(System.in);
		//저장된 2차원 배열 출력하기
		int num = sc.nextInt(); 			// 출력횟수
		for(int i=0; i<num; i++) {
			int k=sc.nextInt();				//k층
			int n=sc.nextInt();				//n호
			System.out.println(apt[k][n]);	//k층 n호의 입주민 명수 출력
		}
		
		sc.close();

	}
}


// 2층 1 4 10 20 35 ...
// 1층 1 3 6 10 15 ...
// 0층 1 2 3 4 5 ... 10

//각 호수의 거주민 = 전 호수의 거주민 + 밑 층의 같은 호수 거주민
//apt[x][y] = apt[x][y-1] + apt[x-1][y]
//[예] 2층 4호수 = 2층 3호수 거주민 + 1층의 4호수 거주민 