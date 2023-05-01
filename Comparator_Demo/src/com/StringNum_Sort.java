package com;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringNum_Sort implements Comparator{

	public static void main(String[] args) {
	
		
		
		
		String[] s = {"15433635537523873258375","1","5","3","10","3"};
		
		Arrays.sort(s , new String_Sorting_Lenth() );
		
		for(String i:s) {
			System.out.println(i);
		}
		
		
	}

	@Override
	public int compare(Object o1, Object o2) {
	
		String s1 = (String)o1;
		String s2 = (String)o2;

		
		return (s1.length()==s2.length()) ? s1.compareTo(s2) : s1.length()-s2.length();
	}

	
	
}
