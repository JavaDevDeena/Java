package al;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArraList_1 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		System.out.println(al);
		System.out.println(al.size());
		
		for(Integer a: al) {
			System.out.println(a);
		}
		System.out.println("rever");
		Collections.reverse(al);
		for(Integer a: al) {
			System.out.println(a);
		}
		
		
		
		
	Iterator list =	al.listIterator();
	
	while(list.hasNext()) {
	
		System.out.print(list.next()+" ");
		
	}
	
	System.out.println();
	
	
	
	al.set(0,100);
	
	for(Integer a:al) {
		System.out.print(a+" ");
	}

	System.out.println();
	Collections.sort(al);
	for(Integer a:al) {
		System.out.print(a+" ");
	}
		
	}
	
	

}
