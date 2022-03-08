package Capgemini;

import java.util.ArrayList;

public class Arraylist_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<>();
		a.add("John");
		a.add("Smith");
		a.add("Sachin");
		a.add("Ajay");
		a.add("Vijay");
		System.out.println("Arraylist A" + a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		System.out.println(a.remove(0));
		
		
		
		
		ArrayList <String > a1 = new ArrayList<>();
		a1.addAll(a);
		System.out.println("Arraylist A1" + a1);
		a1.clear();
		System.out.println("Arraylist A1" + a1);

	}

}
