package studentlist;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.TreeMap;

public class Student {

	static String[] studentNames;
	static int numOfStudent;
	static int numOfSub;
	static String[] subNames;
	static int totalMark;
	static int  marks[][];

	public static void main(String[] args) throws Exception {

		try {

			File file = new File("student.txt");
			BufferedWriter bWrite = new BufferedWriter(new FileWriter(file));

			FileWriter fw = new FileWriter(file);

			Scanner sc = new Scanner(System.in);

			// no of Student
			System.out.println("If you want add student then enter no 1");
			int i2 = sc.nextInt();

			bWrite.write("Enter the Number 1  -----> You have print Number of Student and Student Names");
			bWrite.newLine();
			bWrite.write(Integer.toString(i2));
			bWrite.newLine();

			if(i2==1) {
				System.out.println("Enter the Number Of Student ");
				numOfStudent = sc.nextInt();

				bWrite.write("$ Enter the Number Of Student $");
				bWrite.newLine();
				bWrite.write(Integer.toString(numOfStudent));
				bWrite.newLine();

				studentNames = new String[numOfStudent];

				bWrite.write("Enter the Student Names: ");
				bWrite.newLine();
				System.out.println("Enter the Student Names ");
				for(int i =0;i<numOfStudent;i++) {
					studentNames[i] = sc.next();

					bWrite.write(studentNames[i]);
					bWrite.newLine();

				}
				bWrite.newLine();
			}

			else  {
				System.out.println("In Corecct Number not Store Student Names  ");


			}

			// No of Subjects And Sub Names
			System.out.println("Enter the no 2  You have print Number of Subjects && Subject Names ");
			int i3 =sc.nextInt();
			bWrite.write("Enter the no 2 ----> You have print Number of Subjects && Subject Names");
			bWrite.newLine();
			bWrite.write(Integer.toString(i3));
			bWrite.newLine();

			if(i3==2) {
				System.out.println("Enter Number of Subjects: ");
				numOfSub = sc.nextInt();

				bWrite.write("**---Enter Number of Subjects---** ");
				bWrite.newLine();
				bWrite.write(Integer.toString(numOfSub));
				bWrite.newLine();

				subNames = new String[numOfSub];

				System.out.println("Enter the Subject Names");

				bWrite.write("^^--- Enter the Subject Names ---^^ ");
				bWrite.newLine();

				for(int i = 0;i<numOfSub;i++) {
					subNames[i] =sc.next();

					bWrite.write(subNames[i]);
					bWrite.newLine();



				}
			}

			bWrite.newLine();

			//Marks Allocate
			System.out.println("Enter Number 3 you have Stored marks of students ");
			int i4 = sc.nextInt();

			bWrite.write("Enter Number 3 ---> you have Stored marks of students ");
			bWrite.newLine();
			bWrite.write(Integer.toString(i4));
			bWrite.newLine();

			if(i4==3) {
				marks = new int[numOfStudent][numOfSub];
				for(int i =0;i<numOfStudent;i++) {
					System.out.println("Enter the marks of: "+studentNames[i]+":");

					bWrite.write("# --- Enter the marks of Student --- # ");
					bWrite.newLine();
					bWrite.write(studentNames[i]);
					bWrite.newLine();


					for(int j =0; j<numOfSub;j++) {
						marks[i][j] = sc.nextInt();
						bWrite.write(Integer.toString(marks[i][j]));
						bWrite.newLine();


					}
				}
			}

			bWrite.newLine();

			System.out.println("");
			System.out.println("   ");
			System.out.println("Student Marklist");
			System.out.println("-------------------");

			bWrite.write("$--- STUDENT MARKLIST---$");
			bWrite.newLine();
			bWrite.newLine();

			int overallIndex=0;
			int overallMarks = 0;

			for(int i = 0; i<numOfStudent;i++) {
				totalMark = 0;
				System.out.println("\nName: "+studentNames[i]);

				bWrite.write("Name:  "+studentNames[i]);
				bWrite.newLine();

				System.out.println("Subject\t\tMarks");
				bWrite.write("$ _ Subject     Marks _ $");
				bWrite.newLine();
				bWrite.newLine();
				for(int j =0;j<numOfSub;j++) {
					System.out.println(subNames[j]+"\t\t"+marks[i][j]);

					bWrite.write("   "+subNames[j]+"   ---   "+Integer.toString(marks[i][j]));
					bWrite.newLine();
					bWrite.newLine();

					totalMark +=marks[i][j];

				}

				System.out.println("Total: "+totalMark);

				bWrite.write("Total: "+Integer.toString(totalMark));
				bWrite.newLine();


				if(totalMark > overallMarks ) {
					overallIndex = i;
					overallMarks=totalMark;
				}

			}
			bWrite.newLine();

			//Overall Topper
			System.out.println("Enter the number 4 You have seen Overall Topper");

			bWrite.write("Enter the number 4 ---> You have seen Overall Topper");
			bWrite.newLine();

			int i5 = sc.nextInt();
			bWrite.write(Integer.toString(i5));
			bWrite.newLine();

			if(i5==4) {
				System.out.println("Overall Topper: "+ studentNames[overallIndex]+" with "+overallMarks+" marks" );
				bWrite.write("Overall Topper ---> "+studentNames[overallIndex]+"  "+overallMarks);
				bWrite.newLine();

			}else {
				System.out.println("Incorrect Number Check it");
			}


			bWrite.newLine();

			//Find Subject Wise Topper
			System.out.println("Enter Number 5 you have Seen Subject wise Topper");
			bWrite.write("Enter Number 5 --->  You have Seen Subject wise Topper");
			bWrite.newLine();

			int s4 =sc.nextInt();
			bWrite.write(Integer.toString(s4));
			bWrite.newLine();

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

					bWrite.write("Subject Wise Topper ---> "+subNames[i]+" "+studentNames[overallMarks]+" "+overallIndex);
					bWrite.newLine();

				}

			}	
			bWrite.flush();
			bWrite.close();

			BufferedReader bRead = new BufferedReader(new FileReader(file));

			int readinput = 6;
			if(readinput==6) {
				String line =	bRead.readLine();

				while(line!=null) {
					System.out.println(line);
					line =	bRead.readLine();

				}
			}

			System.out.println(); 

			bRead.close();
			System.out.println();


			sc.close();

		}catch(Exception e) {
			System.out.println(e);
		}


	}
}