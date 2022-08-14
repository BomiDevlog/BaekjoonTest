package test220813;
//[백준/JAVA] 킹, 퀸, 룩, 비숍, 나이트, 폰
import java.util.*;
public class Main3003_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int []arr=new int[6];//입력받을 빈배열
		int []ans=new int[6];//정답 비교용 빈배열
		int []chess= {1,1,2,2,2,8};//체스 정답
		
		for(int i=0; i<6; i++) {
			arr[i]=sc.nextInt(); 
		}
		
		for(int j=0; j<6; j++) {
			ans[j]=chess[j]-arr[j];
			System.out.print(ans[j]+" ");
		}
		
		
		
	}

}




/*
 * for(int i=0; i<6; i++) {
    arr[i]=sc.nextInt(); 
}
nextInt() 함수가 동작하는 방법이 원래 그렇습니다.

0 1 2 2 2 7
와 같이 입력하면 nextInt() 함수는 터미널에서 먼저 0 을 읽습니다.

arr[0] = 0
이 됩니다. 즉, 정수형을 읽을 때 구분자(주로 공백문자, 줄바꿈문자('\n'), 탭문자('\t')가 구분자로

사용됩니다.)를 기준으로 읽는 것입니다.

다음 번 for loop 에서 또 다시 nextInt() 함수가 실행되고 이때는 1 을 읽습니다.

차례대로, 정수 하나씩 읽게 되는 것입니다.

​

만약,

122227 
이렇게 입력하면 이것은 122227 이라는 숫자 하나로 읽게 되고(구분자가 없으므로 하나의 숫자로 인식)

그러면 2번째 for 문에서 읽을 것이 없게 되어 에러가 발생할 것입니다.

​
 * 
 * */
 