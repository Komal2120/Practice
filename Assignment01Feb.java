package Capgemini;

public class Assignment01Feb {
	int value =20000;

	synchronized void Division(int number){    
		System.out.println("Dividing Number...");    
		    
		if(number<0){    
		System.out.println("Division Not possible ");    
		try{wait();
		}
		catch(Exception e){
			System.out.println(e);
		}    
		}    
		this.value=this.value/number;    
		System.out.println("Division  = " + this.value);    
		}    
	synchronized void multiplication(int m) {
		System.out.println("Multiplying..");
		this.value=this.value*m;
		System.out.println("multiplication  =" + this.value);
		notify();
		
	}
	public static void main(String[]args) {
		Assignment01Feb a = new Assignment01Feb();
		
		new Thread() {
			public void run() {
				a.Division(500);
			}
		}.start();
		new Thread() {
			public void run() {
				a.multiplication(20);
			}
		}.start();
	}

}
