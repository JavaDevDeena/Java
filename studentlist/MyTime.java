package studentlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MyTime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
	
		System.out.println("Enter the num of Student");
		int  numOfStudent  = sc.nextInt();
		ArrayList<String> studentNames  = new ArrayList<String>(numOfStudent );
		
		System.out.println("Enter Student Names: ");
		for(int i =0; i<numOfStudent; i++) {
		studentNames.add(sc.next());
		}
		
    	System.out.println("Enter No of Subjects: ");
	    int numOfSub = sc.nextInt();
	
    	System.out.println("Enter Subject Names: ");
    	ArrayList<String> subjectNames = new ArrayList<>(numOfSub);
    	for(int i =0; i < numOfSub; i++) {
		subjectNames.add(sc.next());
	    }
    	
	    System.out.println("Marks Allocate: ");
	   
	    int marks[][] = new int[numOfStudent][numOfSub];
    for(int i =0; i<numOfStudent;i++) {
    	System.out.println("Student Names: "+studentNames.get(i));
    	for(int j = 0; j<numOfSub;j++) {
    		 marks[i][j] = sc.nextInt(); 
    	}
    }
	    
	   System.out.println("STUDENT MARK LIST");
	   System.out.println("------------------->");
	   
	   
	    int overallIndex=0;
	    int overallMarks = 0;
	    
	   for(int i = 0; i < numOfStudent ; i++ ) {
		  int totalMark = 0;
		   System.out.println("Student Names: "+studentNames.get(i));
		   for(int j =0; j<numOfSub;j++) {
			   System.out.println(subjectNames.get(j) + "    "+ marks[i][j]);
			   totalMark +=marks[i][j];
		   }
		   
		   System.out.println("Total: "+totalMark);
	   
	   if(totalMark>overallIndex) {
		   overallIndex = i;
   		overallMarks=totalMark;
	   }
	   
	   
	   }
	    
	
	}
	




}

