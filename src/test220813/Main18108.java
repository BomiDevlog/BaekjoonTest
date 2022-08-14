package test220813;
//[백준/JAVA] 18108번 1998년생인 내가 태국에서는 2541년생?!
/* 불교 국가인 태국은 불멸기원(佛滅紀元), 즉 석가모니가 열반한 해를 기준으로 연도를 세는 불기를 사용한다. 
 * 반면, 우리나라는 서기 연도를 사용하고 있다. 
 * 불기 연도가 주어질 때 이를 서기 연도로 바꿔 주는 프로그램을 작성하시오.
 * 
 * 서기 연도를 알아보고 싶은 불기 연도 y가 주어진다. (1000 ≤ y ≤ 3000)
 * 불기 연도를 서기 연도로 변환한 결과를 출력한다.
 * */
import java.util.*;
public class Main18108 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		
		if(y>=1000 && y<=3000) {
		System.out.println(y-543);
		}
	}

}
