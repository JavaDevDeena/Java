package studentlist;

import java.util.Scanner;

public class Practice {
	
	static int numOfStudent;
    static String studentNames[];
    
    static int numOfSubjects;
    static String SubjectNames[];
    
    static  int marks[][];
   
    static int totalMark;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//STUDENT NAME
		System.out.println("Enter the no of Student");
		numOfStudent=sc.nextInt();
		System.out.println("Enter the Student Names");
		studentNames = new String [numOfStudent];
		for(int i =0;i<numOfStudent;i++) {
			studentNames[i] =sc.next();
		}
		//SUBJECT NAME
		System.out.println("Enter the Num of Sub ");
		numOfSubjects = sc.nextInt();
		System.out.println("Enter the Subject Names: ");
		SubjectNames = new String[numOfSubjects];
		for(int i=0; i<numOfSubjects;i++) {
			SubjectNames[i] = sc.next();
		}

		//Marks Allocate
		System.out.println("Marks Allocate");
		marks = new int[numOfStudent][numOfSubjects];
		for(int i=0; i<numOfStudent;i++) {
			System.out.println("Enter the Marks Of: "+studentNames[i]);
		for(int j=0; j<numOfSubjects;j++) {
			marks[i][j] =sc.nextInt(); 
		}
		}
		//MARKS DISPLAY
		System.out.println();
		System.out.println("Student MarktList");
		System.out.println("------------------");
	
		int index = 0;
		int overallMarks = 0;
		
		for(int i = 0; i < numOfStudent; i++) {
			 totalMark = 0;
			System.out.println("NAME: "+studentNames[i]);
			System.out.println("SUBJECT\t\tMARKS");
		for(int j =0;j<numOfSubjects;j++) {
			System.out.println(SubjectNames[j]+"\t\t"+marks[i][j]);
			     totalMark    +=      marks[i][j];
		}		
		System.out.println("TOTAL: "+totalMark);
		
		if(totalMark>overallMarks) {
			index = i;
			overallMarks = totalMark;
		}
		}
		
		System.out.println("OVERALL TOPPER IS "+studentNames[index]+" with "+overallMarks+" marks");
		
		//SUBJECT WISE TOPPER
		
		for(int i = 0; i<numOfSubjects;i++) {
			index = 0;
			overallMarks = 0;
			for(int j =0; j<numOfStudent;j++) {
				if(marks[j][i]>overallMarks) {
					
					overallMarks = marks[j][i];
					index = j;
				}
			}
				System.out.println("SUBJECT WISE TOPPER "+SubjectNames[i]+" is "+studentNames[index]+" "+overallMarks);
			}
		}
		
	}


