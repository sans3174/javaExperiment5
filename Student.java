package chuli;
public class Student{
	String name;
	int number;
	int age;
	String num;
	Student(String a,int b,int c,String d){
		name=a;
		number=b;
		age=c;
	    num=d;
	}
    public String informationWrite() {
    	return "姓名:"+name+" 学号:"+number+" 年龄:"+age+" 性别:"+num+'\n';
    }
}