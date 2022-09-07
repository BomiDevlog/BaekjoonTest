package test220906;
//[백준/자바] 2884번 알람시계
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main2884{
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		if(m>=45) {// 1. 분이 45분보다 크거나 같을 경우
			m-=45;
		}
		else { // 2. 분이 45분보다 작을 경우 : 시-1, 분+15
			if(h!=0) {
				h-=1;
				m+=15;
			}else { // 2-2. 0시인 경우. 23시로 설정
				h=23;
				m+=15;	
			}
		}
		System.out.println(h+" "+m);
		br.close();		
				
	}//
}