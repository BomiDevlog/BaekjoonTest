package test220809;
//[백준/JAVA] 11720번 숫자의 합
//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
//입력으로 주어진 숫자 N개의 합을 출력한다.
import java.util.Scanner;
public class Main11720 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num=sc.nextInt();
		String str=sc.next();
		sc.close();
		
		int sum=0;
		
		for(int i=0; i<num; i++) {
			sum += str.charAt(i)-'0';
			// charAt() 은 해당 문자의 아스키코드 값을 반환하므로 반드시 -48 또는 -'0' 을 해주어야 우리가 입력받은 숫자 값 그대로를 사용할 수 있다.
		}
		System.out.println(sum);
		
		
	}

}

