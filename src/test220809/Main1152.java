package test220809;
//[백준/JAVA] 1152번 단어의 개수 ---틀림ㅜㅜ
import java.util.Scanner;
public class Main1152 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String word=sc.nextLine().trim();
		//nextLine()으로 받아야 띄어쓰기까지 문자열 입력받는다.

		int count=1;
		if(word.isEmpty()) {//공백일 경우는 0개의 문자
			System.out.println(0);
		}else {
			for(int i=0; i<word.length();i++) {
				if(word.charAt(i)==' ') { //i번째 문자가 있으면 count++하라.
					count++;
				}//if
			}//for
		}//else
		System.out.println(count);
		
		
	}//main()
}

/*1. charAt()을 이용하는 방법
  문자열.trim() : 문자열의 앞뒤 공백을 없애주는 메서드
  문자열.isEmpty() : 문자열이 공백으로 이루어져있는지 참과 거짓으로 판별내주는 메서드
 * 2. split()을 이용하는 방법도 있음
*/
 

