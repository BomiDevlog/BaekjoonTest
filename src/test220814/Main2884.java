package test220814;
//[백준/JAVA] 2884번 알람시계 // 45분 일찍으로 시간 바꾸기
import java.util.*;
public class Main2884 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int m=sc.nextInt();
		
		if(m>=45) {//1. 45분보다 분이 클 경우
			m-=45;
			System.out.println(h+" "+m);
		}else {//2. 45분보다 분이 작을 경우
			if(h!=0) {//0시가 아닐 경우
			m+=15;
			h-=1;
			}else if(h==0) {//0시일 경우
				h=23;
				m+=15;
			}
			System.out.println(h+" "+m);
		}
	
		
		

	}

}
