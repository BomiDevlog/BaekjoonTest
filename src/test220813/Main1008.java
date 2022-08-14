package test220813;
//[백준/JAVA] 1008번 A/B : 조건 0 < A, B < 10
import java.util.*;
public class Main1008 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double A=sc.nextInt();
		double B=sc.nextInt();
		
		if(0<A && B<10)
		System.out.println(A / B);


	}

}

//int로 받으면 나머지가 사라지기 때문에 (ex. 1/3=0.333333333이 나와야 하는데 0이 나옴) double로 받는다
