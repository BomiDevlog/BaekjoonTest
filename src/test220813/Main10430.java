package test220813;
//[백준/JAVA]첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
//첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
import java.util.*;
public class Main10430 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
		
		
	}

}
