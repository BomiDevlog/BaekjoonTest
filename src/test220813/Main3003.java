package test220813;
//[백준/JAVA] 킹, 퀸, 룩, 비숍, 나이트, 폰
import java.util.*;
public class Main3003 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);


		 int[] cnt = new int[6]; //6칸 배열
         int[] full = new int[]{1, 1, 2, 2, 2, 8};//정확한 체스 개수
         for (int i = 0; i < 6; i++) {
             cnt[i] = sc.nextInt(); //입력값을 빈배열에 넣어줌
         }

         for (int i = 0; i < full.length; i++) {//입력배열과 체스배열을 비교하여 출력
             cnt[i] = full[i] - cnt[i];
             System.out.println(cnt[i]);
         }

	}

}
