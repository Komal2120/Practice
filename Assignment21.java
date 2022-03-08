package Capgemini;

import java.util.Scanner;

public class Assignment21 {
	
	void checkoddeven(int n) {
		if(n%2==0) {
			System.out.println(n+ "is an even number!");
		}
		else {
			System.out.println(n+ "is an odd number!");
			
		}
		
	}
	void checkAmstrong(int n ) {
	     int digit=0 , temp = n , n1=n,sum=0,r=0 ;
	    
	     
	     while(n>0) {
	    	 digit++;
	    	 n=n/10;
	     }
	     while(n1>0) {
	    	 r=n1%10;
	    	 sum=(int)(sum+Math.pow(r,digit));
	    	 n1=n1/10;
	    	 
	     }
	     
	     if(sum==temp) {
	    	 System.out.println(temp+ " is an Amstrong Number!");
	     }
	     else {
	    	 System.out.println(temp+ " is an not Amstrong Number!");
	     }
	     
	     
	     
	}
	
	void checkPrime(int n ) {
		int m = n/2,flag =0 ;
		if(n==0||n==1) {
			System.out.println("Neither Prime nor composite");
			
			
		}
		else {
			for(int i = 2 ; i<m ; i++) {
				if (m%2==0) {
					flag=1;
					break;
				}
				
			}
		}
		if(flag==1) {
			System.out.println(n+ " is not prime number");
		}
		else {
			System.out.println(n+ " is prime number");
			
		}
		
	}
	void checkPalindrome(int n ) {
		int temp = n ,sum =0 ,r=0 ; 
		while(temp>0) {
			r=temp%10;
			sum=(sum*10)+r;
			temp=temp/10;
			 
		}
		if(sum==n) {
			System.out.println(n+ "is a Palindrome");
		}
		else {
			System.out.println(n+ "is not a Palindrome");
			
		}
		
	}
	
	

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Assignment21 a = new Assignment21();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number of Your Choice:");
		int n =sc.nextInt();
		int choice=0 ;
		do {
			System.out.println("_______________________________________________________________________________________");
			System.out.println("1.Check Even Odd\n2.Check Prime\n3.Check Armstrong\n4.Check Palindrome\n5.Exit");
			System.out.println("_______________________________________________________________________________________");
			System.out.println("Enter Your Choice:");
			
			 choice = sc.nextInt();
			switch(choice) {
			case 1:
				a.checkoddeven(n);
				break;
			case 2:
				a.checkPrime(n);
				break;
			case 3 :
				a.checkAmstrong(n);
				break;
			case 4:
				a.checkPalindrome(n);
				break;
			case 5 :
				System.exit(choice);
				break;
		    default:
		    	System.out.println("INVALID CHOICE! ENTER AGAIN");
				
			}
		}while(choice!=5);

	}

}
