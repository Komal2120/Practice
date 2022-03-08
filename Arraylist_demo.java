package Capgemini;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_demo {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList (); // Non-generic
		a.add(250);
		a.add("Komal");
		a.add(23.6);
		a.add(26.5f);
		
		System.out.println(a);
		
		Iterator  it = a.iterator();// using iterator
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		ArrayList<String> b = new ArrayList<String> (); // generic - Stores only String type of value  other than String data inserted will give compile time error
		
		b.add("a");
		b.add("Komal");
		b.add("av");
		b.add("cn");
		
		System.out.println(b);
		
		Iterator <String> it1 = b.iterator();// using iterator
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}

	}

}
