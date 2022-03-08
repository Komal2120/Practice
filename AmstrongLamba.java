package Capgemini;

import java.util.Scanner;

interface Function {
	String amstrongNo(int n);
}

public class AmstrongLamba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Function f = (n)->{
			int temp = n ;
			int n1 = n ;
			int sum = 0; 
			int count = 0;
			while( temp > 0 ){
				int r = temp%10;
				count++;
				temp=temp/10 ; 				
				
			}
			while( n1 > 0 ){
				int r = n1%10;
				sum= (int) (sum+Math.pow(r, count));
				n1=n1/10 ; 				
				
			}
			if(sum==n) {
				return "The number is an Amstrong Number";
			}
			
			return "The number is not an Amstrong Number";
			
		};
		
		System.out.println(f.amstrongNo(num));
		
		

	}

}
