package test220825;
//[백준/자바] 1978번 소수 찾기 
//주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오. 
//첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.


import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1978_2 {
	//나누기해서 나머지가 0인게 없음 1과 자기자신만 나누어지는 게 소수. 그래서 나머지 이용하는거.

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N= Integer.parseInt(br.readLine()); //입력숫자 개수
		StringTokenizer st=new StringTokenizer(br.readLine(), " "); // 숫자입력: 공백을 기준으로 토큰화


		while(st.hasMoreTokens()){ // 다음 토큰이 있다면 (다음 숫자있으면 true -> 실행)
            int n = Integer.parseInt(st.nextToken()); // 다음 숫자를 int화.
            if(n == 1){
                N--;
                continue;
            }
            for(int i = 2; i < n; i++){
                if(n % i == 0) {
                    N--;
                    break;
                }
            }
        }
        System.out.println(N); 

	}//

}

/* * 
 * StringTokenizer
StringTokenizer의 역할은 String에서 구분자를 통해서 토큰형태로 나눌 때 사용하는 클래스입니다
기본적으로 구분자 집합에는 "\t\n\r\f"를 사용합니다
즉, 공백문자, 탭문자, 새줄문자 등의 문자를 말합니다
하지만 구분 기호 문자 자체는 토큰으로 처리되지 않습니다


 * hasMoreToken()
StringTokenizer에 사용할 수 있는 토큰이 더 있는지 확인합니다
이 메서드가 ture를 반환하는 경우는 토큰이 존재하고, false를 반환하는 경우 토큰이 없다는 것 입니다

 * 
 * nextToken()
StringTokenizer에서 다음 토큰을 불러오는 메서드입니다


 * */