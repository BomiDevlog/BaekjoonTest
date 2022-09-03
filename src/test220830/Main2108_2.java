package test220830;


//[백준/자바] 2108번 통계학
/*
 * 수를 처리하는 것은 통계학에서 상당히 중요한 일이다. 통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다. 단, N은 홀수라고 가정하자.

산술평균 : N개의 수들의 합을 N으로 나눈 값
중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
최빈값 : N개의 수들 중 가장 많이 나타나는 값
범위 : N개의 수들 중 최댓값과 최솟값의 차이
N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.

첫째 줄에 수의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 단, N은 홀수이다. 그 다음 N개의 줄에는 정수들이 주어진다. 입력되는 정수의 절댓값은 4,000을 넘지 않는다.

첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
둘째 줄에는 중앙값을 출력한다.
셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
넷째 줄에는 범위를 출력한다.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2108_2 {

	public static void main(String[] args) throws IOException {	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		
		int sum = 0; // 산술평균을 구해주기위한 합
		
		int mid = 0; // 중앙값
		int[] max_arr = new int[8001]; // 최빈값 배열 -4000 ~ 4000
		int max = -4000, min = 4000; // 범위
		
		//평균은 더해서 나누면되고. 값이 int로 나와야하니까 round반올림.
		//Arraysort로 순서대로 정렬해서 중앙값은 나누기2해서 가운데 배열찾고ㅡ 가장 마지막 배열에서 가장 앞배열을 빠ㅐ면 범위. 근데 최빈값은 모르겠... 
		
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			
			// 산술평균
			sum += arr[i];
			
			// 최빈값
			max_arr[arr[i] + 4000]++;
			
			
			// 범위
			if(N == 1) {
				max = 0;
				min = 0;
			}else {
				if(max < arr[i]) {
					max = arr[i];
				}
				if(min > arr[i]) {
					min = arr[i];
				}
			}			
		}
		
		// 중앙값
		Arrays.sort(arr);
		mid = arr[N/2];
		
		// 최빈값
		int max_cnt = 0;
		int result = 0;
		for(int i = 0; i < max_arr.length; i++) {
			if(max_cnt < max_arr[i]) {
				max_cnt = max_arr[i];
				result = i - 4000;
			}
		}
		int cnt = 0;
		for(int i = 0; i < max_arr.length; i++) {
			if(max_cnt == max_arr[i]) { // 최빈값이 중복일 경우
				result = i - 4000;
				if(cnt == 1) {
					break;
				}
				cnt++;
			}
		}
		
		System.out.println((int)Math.round((double)sum/N)); // 산술평균
		System.out.println(mid); // 중앙값
		System.out.println(result); // 최빈값
		System.out.println(max - min); // 범위
		br.close();
	}
	
}

/*
 * 산술평균

1. 값을 입력 받을 때 마다 입력값을 sum에 더해준다.

2. 출력 시 입력 값을 N으로 나누고 Math.round()로 반올림한다.

​

중앙값

N이 홀수 이므로 함수를 정렬 했을 때 N/2번째의 수를 찾아내면 된다.

1. Arrays.sort()를 이용하여 배열을 정렬한다.

2. arr[N/2]를 찾아 출력한다.

​

최빈값

카운팅 정렬을 이용한다.

1. 입력되는 정수의 절댓값은 4,000을 넘지 않으므로 -4000 ~ 4000 사이의 정수를 입력받는다.

2. -4000 ~ 4000 사이의 정수의 배열 arr[8001]를 생성한다.

3. max_cnt 변수에 최빈값의 정수를 담는다.

4. 최빈값이 같을 경우 최빈값 중 두번째로 작은 정수를 출력해야하므로 for문을 한번 더 사용하여 최빈값을 찾는다.

​

범위

1. max와 min의 변수를 사용하여 가장 큰수와 가장 작은 수를 찾는다.

2. max - min이 범위를 나타내므로 이를 출력한다.

3. N = 1일 경우 범위가 0 이므로 max = 0, min = 0으로 두고 결과를 출력한다.
[출처] [백준] 2108번 통계학 - JAVA[자바]|작성자 inni760
 * */
