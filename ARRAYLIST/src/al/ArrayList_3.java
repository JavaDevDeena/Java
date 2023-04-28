package al;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayList_3 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Deena");
		al.add("Hari");
		al.add("Deena");
		al.add("Kathir");
		al.add("Deena");
		
		ArrayList<String> copy = new ArrayList<String>(al);
		
		ArrayList<Integer> temp = new ArrayList<Integer>(al.size());

		
		
		
		for(int i=0; i<al.size(); i++) {
			int count =0;
			String no = al.get(i);
			count ++;
			for(int j=i+1; j<al.size(); j++) {
				
				if(no.equals(al.get(j))) {
					count +=1;
					al.set(j,"null");
					System.out.println(al.get(j));
				}
				
			}
			
			if(al.get(i) != "null") {
				temp.add(i,count);
			}else {
				temp.add(i,0);
			}
		}
		
		
		
		System.out.println();
		
		
		
		System.out.println(al);
		System.out.println(temp);
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i)+" "+temp.get(i));
		}
		
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("Set");
		Set<String> set = new HashSet<String>(copy);

		for(String s: set) {
           
			list.add(s);
			System.out.println(s);
		
		}
	}
}
