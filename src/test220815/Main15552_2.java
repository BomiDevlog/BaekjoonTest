package test220815;
//[백준/JAVA]15552번 빠른 A+B 
//Java를 사용하고 있다면, Scanner와 System.out.println 
//대신 BufferedReader와 BufferedWriter를 사용할 수 있다. 
//BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
import java.io.*; 
import java.util.StringTokenizer;
//import java.io.IOException;
//import java.io.InputStreamReader;

//첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 
//다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
//각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.

public class Main15552_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;//밖에서 선언하는 이유가 있나용?
		int T=Integer.parseInt(br.readLine());
		
		for(int i=0; i<T;i++) {
			st=new StringTokenizer(br.readLine());
			bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
		}
		bw.close();
		
	}

}

//임의로 코드 줄임. 일단 맞음.