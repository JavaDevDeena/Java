package com;

import java.util.Arrays;
import java.util.Comparator;

public  class String_Sorting implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {

		String s1 = (String)o1;
		String s2 = (String)o2;
		
	int result =	s1.compareTo(s2);
		if(result>0)
		return -1;
		else if(result<0)
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {

		String[] names = {"Deena","Arun","Kathir","Hari"};
		
	//	String[] names = {"23","1","3","365657357","3"};
		
		System.out.println("Before Sorting");

		for(String i:names) {
			System.out.print(i+" ");
		}
		System.out.println();
		//Acending Order
		
		Arrays.sort(names);
		System.out.println("Acending Order Sorting");
		for(String i:names) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("Decending Order Sorting");
		System.out.println();
		
		Comparator com = new String_Sorting();
		Arrays.sort(names, com);
		
		for(String i:names) {
			System.out.print(i+" ");
		}
		
		
		
		
	}

	

}
