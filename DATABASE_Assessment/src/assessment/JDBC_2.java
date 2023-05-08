package assessment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_2 {

	public static void main(String[] args)  {

		try {

			Scanner sc = new Scanner(System.in);

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","root");
			Statement stmt = con.createStatement();

			System.out.println("?...What do you want to do...?");
			System.out.println();
			System.out.println("< --- LOGIN process to View student detailes  press ----> 1");
			System.out.println("< --- You have to Insert with new student detailes press ----> 2");
			System.out.println("< --- You have Change or Update student marklist ---> 3 ");
			System.out.println("< ---- You have Delete student active to inactive Status login process press ----> 4");
			System.out.println("< --- You have Update student inactive to active ---> 5 ");

			int process = sc.nextInt();

			switch(process) {   //  switch start

			case 1:  // --> case 1 start
			{


				while(true) { // ---> start

					System.out.println("Enter user_name");
					String userName = sc.next();
					System.out.println("Enter user_Password");
					String userPassword = sc.next();
					String active_id = "active";

					String sql = "select login_id  from login where username='"+userName+"' and  userpassword ='"+userPassword+"' and status_id = '"+active_id+"'  ";  
					ResultSet rs =	stmt.executeQuery(sql);
					int loginId =0;

					if(rs.next()) 
						
					{
						
						System.out.println("Success");
						loginId = rs.getInt("login_id");
						int rollId;
						String s4 = "select s.login_id,s.studentname,s.mark from student_detailes s left join  login lo  on s.login_id = lo.login_id where lo.login_id ='"+loginId+"'";
						ResultSet rs4 = stmt.executeQuery(s4);

						while(rs4.next()) 
						{
							rollId = rs4.getInt("login_id"); 
							String studentName = rs4.getString("studentname");
							int marks = rs4.getInt("mark");

							System.out.println();
							System.out.println("Student Id:  "+rollId+"      Student Name: "+studentName+"     Student Mark: "+marks);

						}

						System.out.println("You want to stop this process  press ---> 1");
						int i = sc.nextInt();
						if(i==1) 
						{
							System.out.println("Stop this process");
							break;
						}else
						{
							System.out.println("Continue this process");
						}

					}
					else {
						System.out.println("Failed");
					}

				} //  while  --> End 

				break;

			}   // case 1 ---> end



			case 2:   // case 2 --->  Start

			{  

				System.out.println("Enter Number of Student");
				int numOfstudent = sc.nextInt();


				for(int i =0; i<numOfstudent; i++ ) {

					System.out.println("Enter Name");	
					String student_names = sc.next();
					System.out.println("Enter mark");
					int marks = sc.nextInt();

					String sql =("insert into student_detailes values('"+student_names+"','"+marks+"')");

					stmt.executeUpdate(sql);
					System.out.println("Successfully Inserted ");

				}
				
				break;

			} //  case 2 ----->  End


			case 3 :  // case 3 --> Start

			{ 
				System.out.println("You Update in student_detailes table");

				System.out.println("Update only change STUDENT NAME  press ----->  1");

				System.out.println("Update only change STUDENT MARK press ----->  2");

				System.out.println("Update STUDENT NAME and STUDENT MARK press ----->  3");

				System.out.println("");

				int update_student = sc.nextInt();

				switch(update_student) {    // --->  inner switch  case

				case 1:     
				{
					System.out.println("Where place to change in Enter student login id");
					int login_id = sc.nextInt();
					System.out.println("Enter Student name");
					String student_name = sc.next();

					String s1 = "update student_detailes set studentName = '"+student_name+" where login_id = '"+login_id+"'  ";

					Boolean b1 =	stmt.execute(s1);
					System.out.println(b1);
					break;

				}
				
				case 2:

				{
					System.out.println("Where place to change in Enter student login id");
					int loginId = sc.nextInt();
					System.out.println("Enter Student mark ");
					int student_mark = sc.nextInt();

					String s2 = "update student_detailes set mark = '"+student_mark+"'  where login_id = '"+loginId+"'  ";

					Boolean b2 =	stmt.execute(s2);
					System.out.println(b2);

					break;

				}

				case 3:

				{
					System.out.println("Where place to change in Enter student login id");
					int login_id_1 = sc.nextInt();
					System.out.println("Enter Student name");
					String student_name_1 = sc.next();
					System.out.println("Enter Student mark ");
					int student_mark_1 = sc.nextInt();

					String s3 = "update student_detailes set studentname = '"+student_name_1+"' , mark =  '"+student_mark_1+"'  where login_id = '"+login_id_1+"'  ";

					Boolean b3 =  stmt.execute(s3);	

					System.out.println(b3);

					break;

				}

				default :

					System.out.println("Check Your input dont match any one");

				}   //    inner switch  --->   End 
				
				break;

			}  //     case 3 --> End


			case 4: 
			{     //   case 4 ----> Start

				System.out.println("Enter User name:");
				String user_name = sc.next();
				System.out.println("Enter User Password ");
				String user_password = sc.next();

				String s4 = "select login_id  from login where username='"+user_name+"' and  userpassword ='"+user_password+"' ";  

				ResultSet rs1 = stmt.executeQuery(s4);

				int log = 0;

				if(rs1.next()) {
					System.out.println("success");
					log = rs1.getInt("login_id");

					String status ="inactive"; 

					String delete = "update login set status_id = '"+status+"' where  login_id = '"+log+"'  ";
					stmt.execute(delete);

					System.out.println("Inactive Status do not login");

				}else {
					System.out.println("Incorrect user or Password");
				}

				break;

			}   //  case 4 --> End

			case 5:   //   case  5 --> Start

			{

				System.out.println("Enter User name:");
				String user_name = sc.next();
				System.out.println("Enter User Password ");
				String user_password = sc.next();

				String s4 = "select login_id  from login where username='"+user_name+"' and  userpassword ='"+user_password+"' ";  

                ResultSet rs1 = stmt.executeQuery(s4);

				int loginId = 0;

				if(rs1.next()) {
					System.out.println("success");
					loginId = rs1.getInt("login_id");

					String status ="active"; 

					String delete = "update login set status_id = '"+status+"' where  login_id = '"+loginId+"'  ";
					stmt.execute(delete);

					System.out.println("Active Status you want to  login");

				}else {
					System.out.println("Incorrect user or Password");
				}

				break;
				
			} // case 5 --> End


			default :

				System.out.println("Check Your input dont match any one");

			}  //  Switch --> End

			sc.close();
			stmt.close();
			con.close();

		}

		catch(Exception e) 
		{
			System.out.println(e.getStackTrace());
		}

	}
}