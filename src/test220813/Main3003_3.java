package test220813;
//[백준/JAVA] 킹, 퀸, 룩, 비숍, 나이트, 폰
import java.util.*;
public class Main3003_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int king=sc.nextInt();
		int queen=sc.nextInt();
		int rook=sc.nextInt();
		int bishop=sc.nextInt();
		int knight=sc.nextInt();
		int pawn=sc.nextInt();
		
		System.out.println((1-king)+" "+(1-queen)+" "+(2-rook)+" "+(2-bishop)+" "+(2-knight)+" "+(8-pawn));
		
	}

}


//참고사항
//10171번 고양이,10172번 개 - 이스케이프 시퀀스: \\ 백슬래시는 두번 쓰기