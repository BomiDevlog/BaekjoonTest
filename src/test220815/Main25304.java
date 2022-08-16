package test220815;
//[백준/JAVA]25304번 영수증
//영수증에 적힌 내용을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.
//구매한 각 물건의 가격과 개수
//구매한 물건들의 총 금액

import java.util.*;
public class Main25304 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();//총 금액
		int N=sc.nextInt();//총 개수 => 반복문횟수를 설정!!
		
		
		
		int sum=0;
		for(int i=1;i<=N;i++) {
			int cost=sc.nextInt();
			int num=sc.nextInt();
			sum+=cost*num;
			//N-=num; 이걸넣으면 틀림..
		}//for
		if(X==sum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
	}

}
//맞다고 나옴.근데 5만원물건 5개-> 살때 10000원 2번 30000원 1번해도 반복문이 5번돌아야해서 입력창나옴
