package al;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList_2 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");

		System.out.println("List Iterator");
		ListIterator<String> list1 = al.listIterator(al.size());
		while(list1.hasPrevious()){
			String str = list1.previous();
			System.out.println(str);
		} 
		
		System.out.println("For Loop");
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println();
		System.out.println("For Each Method");
		al.forEach(a -> {
			System.out.println(a);
		});

		
	}

}
