package assessment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class DB_Assessment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assessment","root","root");
			Statement stmt = con.createStatement();
			
			
			System.out.println("Enter Number of Student");
			int numOfstudent = sc.nextInt();
			
			System.out.println("CONNECTION ESTABLISHED");
			
			for(int i =0; i<numOfstudent; i++ ) {
			System.out.println("Enter ID ");	
			int id = sc.nextInt();
			System.out.println("Enter Name");	
			String names = sc.next();
			System.out.println("enter the mark tamil");
			int tamil = sc.nextInt(); 
			System.out.println("enter the mark english");
			int english = sc.nextInt(); 
			System.out.println("enter the mark maths");
			int maths = sc.nextInt(); 
			System.out.println("Enter Login ID ");
			int login_id = sc.nextInt();
			
			String sql =("insert into student value('"+id+"','"+names+"','"+tamil+"','"+english+"','"+maths+"','"+login_id+"')");
			System.out.println(sql);
			stmt.executeUpdate(sql);
			
			System.out.println();
//			
//			System.out.println("VALUES INSERT SUCCESSFULLY....");
//				
//			}
//			
			


//		    			while(true) {
//							
//						System.out.println("Enter user");
//						String userName = sc.next();
//						System.out.println("Enter Password");
//						String userPassword = sc.next();
//				
//	                 	String sql = "select *  from login1 where username='"+userName+"' and  userpassword ='"+userPassword+"'";             
//
//	                	ResultSet rs =	stmt.executeQuery(sql);
//	                 	
//						
//	                 	
//	                 	
//	                // 	System.out.println("rs: "+rs);
//					
//	             
//	                 	
//	                 	
//	                 	if(rs.next()) {
//						System.out.println("Success");
//						
//						String s2 = "select login1 set username = userName and userpassword = userPassword where login1.student_id = student.student_id";
//						ResultSet r3 = stmt.executeQuery(s2);
//						
//						String sqlString = "select student where student_id = ";
//	                 	ResultSet s4 = stmt.executeQuery(sqlString);
//                        
//	                 	
//
//						
//						
//	                            
////	                      String s1 ="SELECT lo.student_id,stu.studentname FROM  login1 lo LEFT JOIN  student stu  ON  stu.student_id=lo.student_id WHERE lo.student_id ='1'";
////	                            ResultSet rs1 = stmt.executeQuery(s1); 
////
////	                            if(rs1.next()) {
////	                            }
//	                            
//	
//					}else {
//						System.out.println("Failure");
//					}
//					System.out.println("You want to stop this process  press ---> 1");
//					int i = sc.nextInt();
//					if(i==1) {
//						break;
//					}
//						}
			}
//
		    	} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	
	}
}


