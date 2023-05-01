package com;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class String_Sorting_Lenth implements Comparator {

	public static void main(String[] args) {

		
		String[] names = {"31415926535897932384","1","5","3","10","3"};
		
		Comparator com = new String_Sorting_Lenth();
		
		Arrays.sort(names,com);
		
		System.out.println("Lenth wise Acending and Decending Order");
		
		for(String i: names)
			System.out.println(i);
		
//		Arrays.sort(names);
//		System.out.println("Sorting");
//		for(String i: names)
//			System.out.println(i);
		
		
	}	
	
	@Override
	public int compare(Object o1, Object o2) {
         String s1 = (String)o1;
         String s2 = (String)o2;
         
        // return (str1.length()==str2.length()) ? str1.compareTo(str2) : str1.length()-str2.length();
         
        return (s1.length()==s2.length() ? s1.compareTo(s2) : s1.length()-s2.length());
        		 
		

	}

}
