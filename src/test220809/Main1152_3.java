package test220809;
//[백준/JAVA] 1152번 단어의 개수
import java.util.Scanner;
public class Main1152_3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String text=sc.nextLine();
		sc.close();
		
		if(text.isEmpty()) {
			System.out.println(0);
		}else {
			String [] arr = text.split(" ");
			
			int size = arr.length;
			
			if(arr[0].equals("")) {
				size--;
			}
			
			
			
			
			
		}

	}

}
