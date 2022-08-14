package test220813;
//[백준/JAVA] 10926번 ??!
// 아이디는 알파벳 소문자로만 이루어져 있으며, 길이는 50자를 넘지 않는다.
//첫째 줄에 준하의 놀람을 출력한다. 놀람은 아이디 뒤에 ??!를 붙여서 나타낸다.
import java.util.Scanner;
public class Main10926 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String str=sc.next();// nextLine()을 이용해도 됨
		
		System.out.println(str.toLowerCase()+"??!");
		
		
	//길이 50자 조건 안주었는데/일단 정답
	}

}
