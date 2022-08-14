package test220813;
//[백준/JAVA] 2588번 곱셈
import java.util.*;
public class Main2588_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		
		System.out.println(A*(B%10));//일의자리
		System.out.println(A*(B%100/10));//십의자리
		System.out.println(A*(B/100));//백의자리
		System.out.println(A*B);//전체곱

	}

}
