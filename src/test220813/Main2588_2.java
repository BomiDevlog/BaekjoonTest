package test220813;
//[백준/JAVA] 2588번 곱셈
import java.util.*;
public class Main2588_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		
		String b=Integer.toString(B);
		int[] arrB = new int[3];
		for(int i=0; i<3; i++) {
			arrB[i]=b.charAt(i)-'0';
		}
		
		int [] result = new int[3];
        for(int i=0; i<arrB.length; i++){
            result[i] = arrB[arrB.length - i] * A;
            System.out.println(result[i]);
        }
        
        int f_result = A*B;
        System.out.println(f_result);


	}

}
