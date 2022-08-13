package test220811;
//[백준/JAVA] 1343번 폴리오미노
import java.util.Scanner;
public class Main1343 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = "AAAA";
		String b = "BB";
		String input = scan.next();
		String [] arr = new String [500];
		//변환된 값(a, b)이 들어갈 배열
		int [] temp = new int [500];
		//인트 값으로 변환된 input 값이 들어갈 배열
		
		for(int i = 0; i < input.length(); i++) {
			temp[i] = input.charAt(i) - 'W';
			//X 의 자리에 모두 정수 1이 들어가게 변환
		}
		
		int count = 0;
		//연속된 X 를 셀 변수
		int num = 0;
		//배열 위치 지정변수
		boolean flag = true;
		//덮을 수 없을 경우 체크 변수
		for(int i = 0; i < input.length(); i++) {
			if(temp[i] == 1) {
				count++;
				if(count % 4 == 0) {
					arr[num] = a;
					num++;
					count = 0;
					//4로 나누어지면 a 로 변환
				}else if(count % 4 != 0 && count % 2 == 0 && temp[i + 1] != 1) {
					arr[num] = b;
					num++;
					count = 0;
					//4로 나누어지지 않으면서 2로는 나누어지면 배열의 다음 값이 1이 아닌 값
					//즉 연속된 X값이 배열 다음자리에 없으면 이로 나누고 b로 덮어버림
				}	
			}else {
				if(count % 2 != 0) {
					flag = false;
					break;
					//연속 값이 2로 안나누어지면 덮을 수 없음
					//더이상 비교불필요 반복문 종료
					}else {
					arr[num] = ".";
					num++;
					//아니면 배열의 값을 점으로 채우고
					//배열위치 하나씩 더해줌
				}
				
			}
		}
		
		if(flag == false || count == 1) {
			System.out.println(-1);
			//flag 그 여부와 주어진 값이 한자리면 -1 출력
		}else {
			for(int i = 0; i < num; i++) {
				System.out.print(arr[i]);
			}
		}


	}

}
