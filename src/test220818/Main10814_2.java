package test220818;
//[백준/자바] 10814번 나이순정렬 

//출력횟수, 나이, 이름 입력받음
//나이순 정렬
//나이가 같으면 입력순 정렬
//나이와 이름을 공백으로 구분해 출력
import java.util.*;
public class Main10814_2 {
	
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(); //출력횟수
		
		String user[][]= new String [N][2]; //회원정보를 담을 이차원배열 생성

		
		for(int i=0; i<N; i++) {
			user[i][0]= sc.next(); //나이
			user[i][1]= sc.next(); //이름
		} 
		
		// 나이순으로 정렬
		Arrays.sort(user, new Comparator<String[]>() {
			
			@Override
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}	
		});
		//나이순으로 정렬하면 compre 메소드에서 나이가 같을경우(반환값이 0 인경우)는 
		//두 객체의 위치를 바꾸지 않기 때문에 자연스럽게 입력순서로 정렬이 된다.
		
		//출력
		for(int i=0; i<N; i++) {
			System.out.println(user[i][0]+" "+user[i][1]);
		}
	}
}

/*
 * java.util.Arrays
 * 배열을 다룰 때 자주 쓰이는 유용한 메소드들(분류나 검색 등)을 모아놓은 class


sort() : 배열 오름차순 정렬

binarySearch() : 오름차순 정렬된 배열에서 원하는 데이터 값이 저장된 index를 리턴.

copyOf() : 원본 배열을 원하는 길이만큼 복사한 새로운 배열 객체를 반환

fill() : 배열 데이터값 일괄 채우기/변환

toString() : 배열 데이터를 문자열 표현([배열 데이터, 배열 데이터, 배열 데이터…])으로 반환

 * 
 * */

/*Comparator 객체를 생성하여 Collections나 배열 등을 정렬할 수 있습니다.
 * 2가지방법으로 생성가능: 익명클래스, 람다식
 * 
 * 이 경우는 익명 클래스로 Comparator 생성
 * compare()의 리턴 값은 음수, 양수, 0이 될 수 있습니다. 음수가 리턴되면 오른쪽 인자가 아래로 내려갑니다.
 * */
 