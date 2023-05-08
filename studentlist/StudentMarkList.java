package studentlist;

import java.util.Scanner;

public class StudentMarkList {

  static	String[] studentNames;
  static 		int numOfStudent;
  static int numOfSub;
  static String[] subNames;
  
 static	int totalMark;
 static  int  marks[][];

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
    // no of Student
	System.out.println("Enter the Number 1: ");
	int i2 = sc.nextInt();
    if(i2==1) {
    System.out.println("Enter the Number Of Student");
     numOfStudent = sc.nextInt();
   
     studentNames = new String[numOfStudent];
    
    System.out.println("Enter the Student Names");
    for(int i =0;i<numOfStudent;i++) {
    	studentNames[i] = sc.next();
    }
    }
    
    // No of Subjects And Marks...
    System.out.println("Enter the no 2: ");
    int i3 =sc.nextInt();
    if(i3==2) {
    System.out.println("Enter Number of Subjects: ");
     numOfSub = sc.nextInt();
     subNames = new String[numOfSub];
    
    System.out.println("Enter the Subject Names");
    for(int i = 0;i<numOfSub;i++) {
    	subNames[i] =sc.next();
    }
    }
    
    // Enter marks
    System.out.println("Enter Number 3: ");
    int i4 = sc.nextInt();
    if(i4==3) {
     marks = new int[numOfStudent][numOfSub];
    for(int i =0;i<numOfStudent;i++) {
    	System.out.println("Enter the marks of: "+studentNames[i]+":");
    
    for(int j =0; j<numOfSub;j++) {
    	marks[i][j] = sc.nextInt();
    }
    }
    }
    System.out.println("");
    System.out.println("   ");
    System.out.println("Student Marklist");
    System.out.println("-------------------");
    
    int overallIndex=0;
    int overallMarks = 0;
    
    for(int i = 0; i<numOfStudent;i++) {
    	 totalMark = 0;
    	System.out.println("\nName: "+studentNames[i]);
    	System.out.println("Subject\t\tMarks");
    	for(int j =0;j<numOfSub;j++) {
    		System.out.println(subNames[j]+"               "+marks[i][j]);
    		totalMark +=marks[i][j];
    	}
    	
    	System.out.println("Total: "+totalMark);
    	
    	if(totalMark > overallMarks ) {
    		overallIndex = i;
    		overallMarks=totalMark;
    	}
    
    }
    
    System.out.println("Enter number 4");
    int i5 = sc.nextInt();
    if(i5==4) {
    System.out.println("Overall Topper: "+ studentNames[overallIndex]+" with "+overallMarks+" marks" );
    }
    
    System.out.println("Enter 5");
    int s4 = sc.nextInt();
 
    if(s4==5) {

		for(int i=0;i<numOfSub;i++) {
			overallIndex = 0;
			overallMarks=0;

			for(int j=0; j<numOfStudent;j++) {
				if(marks[j][i]>overallIndex) {
					overallIndex=marks[j][i];
					overallMarks=j;
				}
			}

			System.out.println("Subject Wise Topper "+subNames[i]+" is: "+studentNames[overallMarks]+" "+overallIndex);	

			
		}

    	
    
    }		
	}	    	
    	    }
    	    
    	    
    	   
 
 

	




