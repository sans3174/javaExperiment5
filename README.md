# java 课程
java课程作业项目仓库


# 模拟学生作业处理


## 实验目的 


    1.掌握字符串String及其方法的使用
  
    2.掌握文件的读取/写入方法
    
    3.掌握异常处理结构


## 实验要求

### 模拟业务

在某课上,学生要提交实验结果，该结果存储在一个文本文件A中。
文件A包括两部分内容：

一是学生的基本信息

二是学生处理后的作业信息<br>
    该作业的业务逻辑内容是：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能方法，实现如下功能：

      1.每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
      2.允许提供输入参数，统计古诗中某个字或词出现的次数
      3.输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A
      4.考虑操作中可能出现的异常，在程序中设计异常处理程序

### 实验实现内容：


某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。<br>
此时，该博士研究生有双重身份：学生和助教教师。

1.设计两个管理接口：
    
    （1）学生管理接口和教师管理接口
  
     (2)学生接口必须包括缴纳学费、查学费的方法
  
     (3)教师接口包括发放薪水和查询薪水的方法

2.设计博士研究生类:

     (1)实现上述的两个接口
  
     (2)该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性

3.编写测试类:

     (1)实例化至少两名博士研究生
  
     (2)统计他们的年收入和学费，根据两者之差，算出每名博士研究生的年应纳税金额
  
  
### 功能要求要求

 1.在博士研究生类中实现各个接口定义的抽象方法

 2.对年学费和年收入进行统计，用收入减去学费，求得纳税额

 3.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义

 4.实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入

 5.根据输入情况，要在程序中做异常处理
  
### 拓展内容：
  
 1.在博士研究生类中增加了一年中的教学月数，总资产，临时薪水和临时学费等属性
 
 2.在博士生研究生类中增加了查看总资产方法
 
 3.在测试主类中实现了用户决定是否领取工资，是否缴纳年学费，是否缴纳年个人所得税，并反应在总资产上
  
  
## 实验过程


### 具体步骤：


  1.Studentrunner类编写：
  
    （1）声明payTuition(Doctoralcand a)方法
    
    （2）声明inquireTuition(Doctoralcand a)方法
    
  2.Facultyrunner类编写：
  
    （1）声明inquireSalary(Doctoralcand a)方法
    
    （2）声明sendSalary(Doctoralcand a)方法
    
  3.Doctoralcand类编写：
  
    （1）实现前两个接口
    
    （2）设定 姓名，性别，年龄，学期学费，月工资，教学月数，总资产，临时薪水和临时学费 属性
    
    （3）重写接口方法payTuition用于缴纳年学费，并提示缴纳成功
    
    （4）重写接口方法inquireTuition用于查询学期学费，并通知目前应付学费
    
    （5）重写接口方法inquireSalary用于查询月工资，并提示是否领取了工资
    
    （6）重写接口方法sendSalary用于发放年工资，并提示领取成功
    
    （7）编写方法inquireProperty用于查询目前总资产
    
    （8）重写构造方法使构造对象时赋予对象姓名，性别，年龄，总资产的值
  
  4.Test主类编写：
  
    （1）引入第三方库java.util.Scanner
    
    （2）编写静态代码块（代码块内是方法），实现传入博士研究生对象与教学月数即可算出年个人所得税并返回该值
    
    （3）实例化两个博士研究生对象，并在构造时初始化对象姓名，性别，年龄，总资产的值
    
    （4）设置永真循环，并在循环结尾用用户输入的值判断决定是否跳出，在循环内用多个Scanner对象接受用户输入的薪水，学费等值，并用switch实现选定对象赋值
    
    （5）设置永真循环，并在循环结尾用用户输入的值判断决定是否跳出，在循环内用多个Scanner对象接受用户输入的多个判断值，决定是否交税，领取工资，缴纳学费，
    
         并用switch实现选定对象操作，并用switch实现选定对象调用方法打印各种需求的值
    
    （6）从第一个值输入开始到最后作为try代码块，设置异常捕捉
    
    
    


## 核心方法


### Doctoralcand.java:

```java
   	public void payTuition(Doctoralcand a) {
		a.property-=a.tuition*2;    //总资产减学费
		a.ntuition=0;
		System.out.println("本学期学费已上缴");   //用户提示
	}
	public void inquireTuition(Doctoralcand a) {
		System.out.println("本学期应缴纳学费:"+a.tuition);   
		System.out.println("目前应缴纳学费:"+a.ntuition);   //若已缴费，则显示零
	}
```

### Test.java：

```java
while (true) {       //设置永真循环
		System.out.println("输入研究生姓名：");
		Scanner sacn1 = new Scanner(System.in); 
		String a = sacn1.nextLine();     //接受字符串判断将值赋给哪个对象
		System.out.println("输入该生学期学费");
		Scanner sacn2 = new Scanner(System.in); 
		int b = sacn2.nextInt();        //接受整数赋给tuition
		System.out.println("输入该生月薪");
		Scanner sacn3 = new Scanner(System.in); 
		int c = sacn3.nextInt();       //接受整数赋给salary
		System.out.println("输入一年内教学月总数");
		Scanner sacn6 = new Scanner(System.in); 
		int d = sacn6.nextInt();       //接受整数赋给month
		switch(a) {                    //判断将值赋给哪个对象
		case "Zhang":cand1.tuition=b;
					 cand1.salary=c;
					 cand1.month=d;
					 break;
		case "Wang":cand2.tuition=b;
		 			cand2.salary=c;
		 			cand2.month=d;
		 			break;	
		default :System.out.println("该生不存在");   //若用户输入姓名不争取会返回提示
		}
		System.out.println("是否继续设定：");
		Scanner sacn4 = new Scanner(System.in); 
		int panduan1 = sacn4.nextInt(); 
		if(panduan1==0) {              //判断用户输入值决定是否跳出，结束赋值
			break;
		}
```
    
## 实验结果


程序运行截图：<br><br><br>

![%E5%9B%BE%E7%89%871.png](https://github.com/sans3174/javaExperiment4/blob/sans3174.GitHub.io/%E5%9B%BE%E7%89%871.png)

<br>
目前年六万为起征点
<br>

![%E5%9B%BE%E7%89%872.png](https://github.com/sans3174/javaExperiment4/blob/sans3174.GitHub.io/%E5%9B%BE%E7%89%872.png)


## 实验感想

通过本次实验，我学习了简单的系统需求分析<br>
熟悉并练习了Java中抽象类和抽象方法的定义<br>
练习了掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法<br>
了解异常的使用方法，并在程序中根据输入情况做异常处理<br>
练习了不同循环，判断的嵌套编写<br>
练习了程序的查错调试<br>
加深了对java面向对象编程的理解<br>
