package test220814;
//[백준/JAVA] 14681번 사분면 고르기 
import java.util.*;
public class Main14681 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		
		if(A>0 && B>0) {
			System.out.println("1");
		}else if(A<0 && B>0) {
			System.out.println("2");
		}else if(A<0 && B<0) {
			System.out.println("3");
		}else if(A>0 && B<0) {
			System.out.println("4");
		}
		
		

	}

}
