package test220811;

import java.io.IOException;
import java.util.Scanner;

//[백준/JAVA] 1343번 폴리오미노

public class Main1343_3 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] tmp;
        tmp = s.split(""); 
        //split 특정 문자열을 기준으로 문자열을 잘라서 배열에 넣어주는 메서드
        //substring은 문자열 잘라서 그 일부문자열만 반환. split는 배열로 분할해 전체문자열을 배열로 저장
        String answer = "";
       	String temp = "";
    
       	for(int a = 0 ; a<tmp.length; a++) {
        	if(tmp[a].equals("X")) //1) X이면 더함
        		temp += tmp[a];
        	
        	else if(temp.length()==0 && !temp.equals("X")) {//2) .이면 정답에 .추가
        		answer += ".";
        		continue;
        	}
        	//이 밑에는 XXX~ 계속 만들어나가다가 .만난 상태
        	if(!tmp[a].equals("X") || (tmp[a].equals("X") && a==tmp.length-1)) {
                String ans = "";

               	if(temp.length() % 4 == 0) {//3) 4로 나누어지면 전부 A로 채움
               		for(int j = 0; j<temp.length(); j++) {
               			ans += "A";
               		}
               	}
               	//4) 2를뺴고 4로 나누어지면 A부터채우고 나머진 두글자만 B로
               	else if(temp.length()>4 && (temp.length()-2)%4 == 0) {
               		int num = temp.length();
               		for(int i = 0 ; i<num-2; i++) {
               			ans += "A";
               		}
               		ans += "BB";
               	}
               	
               	else if(temp.length()==2) {//5) 두 글자이면 B로
               		ans += "BB";
                }
               	
               	else {//6) 모두 아니면 -1출력 후 종료
               		System.out.println(-1);
               		System.exit(0);
               	}
                answer += ans;
                
                if(a!=tmp.length-1 || (a==tmp.length-1 && !tmp[a].equals("X")))
                	answer += ".";
                temp = "";               	
        	}
        }
       	System.out.println(answer);





	}

}
