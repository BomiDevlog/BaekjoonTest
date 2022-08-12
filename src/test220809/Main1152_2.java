package test220809;
//[백준/JAVA] 1152번 단어의 개수 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1152_2 {

	public static void main(String[] args) throws IOException{
		//사용자에게 문자열을 입력받는다
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
				
		//String클래스의 split메소드를 이용하여 공백을 기준으로 나누어 strArray배열에 저장한다
		String[] strArray = s.split(" ");
				
		//배열의 길이가 즉 단어의 개수이므로 strArray배열의 길이 출력. 자바에서 배열은 객체이기 때문에 .연산자 사용 가능
		System.out.print(strArray.length);
			

	}

}
