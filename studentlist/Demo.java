package studentlist;

import java.util.Scanner;

public class Demo {

  static	String student1,student2;
  static String sub1,sub2,sub3;
  static int mark1,mark2,mark3;
  
 	  public static void main(String[] args) {
		  
		//  Demo obj = new Demo();
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Student1 name");
	        student1 = sc.next();
	        System.out.println("Enter Student2 name:");
            student2 = sc.next();
	       
	        System.out.println("Student names: "+ student1+"       "+student2);  
	        
	      
	        System.out.println("Enter Subjact Name: ");

	        sub1 = sc.next();
	        sub2 = sc.next();
	        sub3 = sc.next();
	        
	        System.out.println("Subjects:  "+sub1+"   "+sub2+"    "+sub3);
	        
	        System.out.println("Enter Student1 marks");
	        mark1=sc.nextInt();
	        mark2=sc.nextInt();
	        mark3=sc.nextInt();
	        System.out.println(sub1+": "+mark1+"   "+sub2+": "+mark2+"   "+sub3+": "+mark3);
	       int total1 = mark1+mark2+mark3;
	       System.out.println("Total: "+total1);
	        System.out.println("Enter Student2 marks");
	        mark1=sc.nextInt();
	        mark2=sc.nextInt();
	        mark3=sc.nextInt();
	        System.out.println(sub1+": "+mark1+"   "+sub2+": "+mark2+"   "+sub3+": "+mark3);
		       int total2 = mark1+mark2+mark3;
		       System.out.println("Total: "+total2);
		       
		       if(total1>total2) {
		          	    	System.out.println(student1+" is the overall topper with marks: "+total1);   
		       }
		       else if(total1<total2) {
			    	System.out.println(student2+" is the overall topper with marks: "+total2);   

		       }
		       else {
		    	   System.out.println("Both are Equal");
		       }



}
	
	}


