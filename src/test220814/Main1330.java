package test220814;
//[백준/JAVA] 1330번 두 수 비교하기
import java.util.*;
public class Main1330 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		
		if(A>B) {
			System.out.println(">");
		}else if(A<B) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}

	}

}
