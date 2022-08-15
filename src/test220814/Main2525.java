package test220814;
//[백준/JAVA] 2525번 오븐 시계 // 시 분 , 조리시간 입력 -> 조리완성시간 시 분으로 출력
import java.util.*;
public class Main2525 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int m=sc.nextInt();
		int cookTime=sc.nextInt();//분단위 입력
		
		int allTime=h*60 +m+cookTime;//완성시간을 분으로 정리
		h=allTime/60;
		m=allTime%60;
		
		//23시 58분에 120분을 더하면 24시간을 넘어가므로
		//26시 58분 =>2시58분으로 정정해야함
		if(h>=24) {
			h-=24;
		}
		System.out.println(h+" "+m);
		
		
		

	}

}
