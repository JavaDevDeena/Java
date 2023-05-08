package studentlist;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;




class DemoList{
	
	static int numOfStudent;
	static String studenrNames[];
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("deena.txt");
		 BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		
	Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		bw.write(Integer.toString(i));
		bw.newLine();
		System.out.println(i);
		
		
		String s = sc.next();
		bw.write(s);
		
		bw.newLine();
		System.out.println(s);
		
		bw.flush();
		bw.close();
		
		
    }
}
	



