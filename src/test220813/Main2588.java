package test220813;

import java.util.Scanner;

public class Main2588 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		
		String b=Integer.toString(B);
		int[] arrB = new int[3];
		for(int i=0; i<3; i++) {
			arrB[i]=b.charAt(i)-'0';
		}

	}

}
