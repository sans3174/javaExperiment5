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
    	return "����:"+name+" ѧ��:"+number+" ����:"+age+" �Ա�:"+num+'\n';
    }
}