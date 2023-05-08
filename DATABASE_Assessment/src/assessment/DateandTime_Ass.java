package assessment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DateandTime_Ass {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginprocess","root","root");
			Statement stmt = con.createStatement();

			while(true) {

				// User Inputs
				System.out.println("< --- Login process --- >");
				System.out.println();
				System.out.println("$_Enter username_$");
				String username = sc.next();
				System.out.println("$_Enter user password_$");
				String userpassword = sc.next();
				String status = "authorized";

				String sql = "select login_id from login_history where username = '"+username+"'and userpassword ='"+userpassword+"'";
				ResultSet rs =   stmt.executeQuery(sql);
				int log_id = 0;

				// Success process
				if(rs.next()) {
					System.out.println("***_Success login_***");
					System.out.println();
					log_id = rs.getInt("login_id");

					String sql1 = "update login_history set login_time = now(),status_id = '"+status+"'  where login_id = '"+log_id+"'  ";
					stmt.execute(sql1);

					// break statement
					System.out.println("< --- If you want stop this process PRESS  --- > ' 1 '  or    <--- If you want continue process PRESS --- > ' 2 '  ");
					int stop = sc.nextInt();
					if(stop == 1) {
						break;
					}else {
						System.out.println("!-loop is continue-!");
						System.out.println();

					}

				}

				// failed process
				else {

					System.out.println("***_failed_***");
					System.out.println();
					String status_info = "non-authorized";
					String s1 = "insert into login_history  values('"+log_id+"','"+username+"','"+userpassword+"','"+status_info+"',now())";
					stmt.executeUpdate(s1);

					String s2 = "update login_history set login_time = now() where login_id = '"+log_id+"'  ";
					stmt.execute(s2);

					// break statement
					System.out.println("< --- If you want stop process PRESS  --- > ' 1 '  or     <--- If you want continue process PRESS --- > ' 2 '  ");
					int stops = sc.nextInt();

					if(stops == 1) {
						break;
					}
					else {
						System.out.println("!_Loop is continue_!");
						System.out.println();
					}
				}

			}
             
			// SHOW TABLE
			System.out.println("< --- $ Login_history table detailes show $ --- >");
			System.out.println();
			String s3 = "select * from login_history";
			ResultSet rs4 = stmt.executeQuery(s3);
			while(rs4.next()) {

				System.out.println("Login Id: "+rs4.getInt("login_id")+"       UserName:  "+rs4.getString("username")+"      UserPassword:  "+rs4.getString("userpassword")+"     Status_Info:  "+rs4.getString("status_id")+" login_DateandTime:  "+rs4.getDate("login_time")+" "+rs4.getTime("login_time"));
				System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

			}	

			sc.close();
			rs4.close();
			stmt.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
