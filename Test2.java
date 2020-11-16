package chuli;
import java.io.*;
import java.util.Scanner;

public class Test2{
	public static void main(String args[]) {	
		System.out.println("输入学生姓名：");
		Scanner sacn1 = new Scanner(System.in); 
		String a = sacn1.nextLine(); 
		System.out.println("输入该生学号");
		int b = sacn1.nextInt(); 
		System.out.println("输入该生年龄");
		int c = sacn1.nextInt(); 
		System.out.println("输入该生性别");
		Scanner sacn2 = new Scanner(System.in); 
		String d = sacn2.nextLine(); 
		Student stu1=new Student(a,b,c,d);
		File sourceFile = new File("B.txt");
		File targetFile = new File("A.txt");
		char[] z=new char[7];
		String w;
		w=stu1.informationWrite();
		Reader in=null;
		try {
			Writer out = new FileWriter(targetFile,true);
			in = new FileReader(sourceFile);
			int n=-1;
			int biao=0;
			out.write(w);
			while((n=in.read(z))!=-1) {
				biao++;
		    	out.write(z);
				if(biao%2==0) {
					out.write("。\n");
				}
				else {
					out.write('，');
				}
			}
			out.flush();
			out.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			//4，释放资源
			try {
				if(null!=in) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}