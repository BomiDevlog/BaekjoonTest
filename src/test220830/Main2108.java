package test220830;

//[백준/자바] 2108번 통계학
/*
 * 수를 처리하는 것은 통계학에서 상당히 중요한 일이다. 통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다. 단, N은 홀수라고 가정하자.

산술평균 : N개의 수들의 합을 N으로 나눈 값
중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
최빈값 : N개의 수들 중 가장 많이 나타나는 값
범위 : N개의 수들 중 최댓값과 최솟값의 차이
N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.

첫째 줄에 수의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 단, N은 홀수이다. 
그 다음 N개의 줄에는 정수들이 주어진다. 입력되는 정수의 절댓값은 4,000을 넘지 않는다.

첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
둘째 줄에는 중앙값을 출력한다.
셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
넷째 줄에는 범위를 출력한다.
 * */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main2108 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); // 수의 개수 (단, N은 홀수)
		
		// 입력값의 범위 : -4000 ~ 4000 (절댓값 4000을 넘지않음)
		int[] arr = new int[8001];
		
		/*  sum = 총 합계 (산술평균에 쓰일 것)
		 *  max = 최댓값
		 *  min = 최솟값 
		 *  median = 중앙값
		 *  mode = 최빈값 
		 */
		int sum = 0;
		int max = Integer.MIN_VALUE; // max는 min으로 설정해두고 최대값으로 교체해감.
		int min = Integer.MAX_VALUE;
		// median 과 mode 는 -4000~4000 을 제외한 수로 초기화하면 된다. (입력값의 범위 밖의 수로 초기화해둠)
		int median = 10000;
		int mode = 10000;
		
		for(int i = 0; i < N; i++) {
			int value = Integer.parseInt(br.readLine()); // N개의 입력값
			sum += value; 
			arr[value + 4000]++; // 왜 4000을 더하지??????? //입력값이 arr 인덱스가 된다. //최빈값 구할 때 사용하기위해 해당 인덱스의 값을 1씩 증가
		
			if(max < value) { //최대값 설정
				max = value;
			}
			if(min > value) { //최소값 설정
				min = value;
			}
		}
		
		
		// 순회 
		int count = 0;	// 중앙값 빈도 누적 수 
		int mode_max = 0; 	// 최빈값의 최댓값  
		
		// 이전의 동일한 최빈값이 1번만 등장했을경우 true, 아닐경우 false
		boolean flag = false;	 
		
		for(int i = min + 4000; i <= max + 4000; i++) { // 왜 4000을 더하는거지?????????
			
			if(arr[i] > 0) {
				
				/*
				 * <중앙값 찾기>
				 * 누적횟수가 전체 전체 길이의 절반에 못 미친다면 
				 */
				if(count < (N + 1) / 2) {
					count += arr[i];	// i값의 빈도수를 count 에 누적
					median = i - 4000;
				}
				
				/*
				 * <최빈값 찾기>
				 * 이전 최빈값보다 현재 값의 빈도수가 더 높을 경우 
				 */
				if(mode_max < arr[i]) {
					mode_max = arr[i];
					mode = i - 4000;
					flag = true;	// 첫 등장이므로 true 로 변경 
				}
				// 이전 최빈값 최댓값과 동일한 경우면서 한 번만 중복되는 경우 
				else if(mode_max == arr[i] && flag == true) {
					mode = i - 4000;
					flag = false;					
				}
			}
		}
		
		System.out.println((int)Math.round((double)sum / N));	// 산술평균 
		System.out.println(median);	// 중앙값 
		System.out.println(mode);	// 최빈값 
		System.out.println(max - min);	// 범위 
	}
 
}

/*Integer.MIN_VALUE / Integer.MAX_VALUE : int형 범위중에서 가장 작은 값, 가장 큰 값을 산출해주는 함수
 * 	System.out.println(Integer.MAX_VALUE); // 2147483647
	System.out.println(Integer.MIN_VALUE); // -2147483648
 *
 * 32비트에서 Int 정수 범위는 -2,147,483,648 ~ 2,147,483,647 이다.
따라서 32비트 Int 정수의 최대값은 2,147,483,647, 최소값은 -2,147,483,648 이다.
(64비트에서도 정수의 경우 32비트와 마찬가지로 4byte라서 같다.)
Integer 클래스의 MAX_VALUE와 MIN_VALUE를 사용하면 정수의 최대값(2,147,483,647)과 최소값(-2,147,483,648)을 바로 출력할 수 있다.
Integer 클래스 외 Long, Short 등의 클래스도 같은 메소드를 제공한다.
 * */

/*
 * 입력과 동시에 누적합은 바로바로 해주면서, 동시에 카운팅 정렬을 위한 배열의 index 값을 1 증가시킨다.

중요한 것은 최빈값인데, 만약에 이전의 최빈값의 최댓값보다 현재 최빈값이 더 클 경우, 
즉 처음으로 나타난 최빈값일 경우 해당 index(i)를 최빈값에 초기화 해주며, flag 를 true 로 변경한다.

만약, 동일한 최빈값을 갖고있으면, 두 가지의 경우의 수가 생긴다. 
첫 번째는 동일한 최빈값이 이전에 1 번만 나타났을경우인데, 
이 경우에는 flag 가 true 일 테니 두 번째로 작은 값이 현재 i 가 되고 결과적으로 mode(최빈값 변수)를 초기화 해주면 된다. 
그리고 반드시 flag를 false 로 바꿔주어야 된다. 
이후에 같은 최빈값이 또 나오더라도 이미 두 번째로 작은 값은 변하지 않기 때문에 
그래야 else if 문을 실행시키지 않으면서 두 번째로 작은 최빈값이 수정되지 않는다.
 * */

/*
 * 산술평균 출력의 경우 그냥 나누면 int 형 때문에 나눗셈 과정에서 무조건 소수점은 버려지기 때문에 
 * 반올림을 위해 Math.round를 쓰기 전에 이미 나눗셈에서 오차가 날 수 있다. 
 * 그러므로 sum 이나 N 둘 중 하나를 double 로 캐스팅하여 소수점이 버려지는 것을 방지하고, 
 * 반올림을 한 다음 int형으로 다시 형변환해야한다.
 * 
 * */

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
3. N = 1일 경우 범위가 0 이므로 max = 0, min = 0으로 두고 결과를 출력한다


*/