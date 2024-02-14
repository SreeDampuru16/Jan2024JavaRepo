package PackageJava;

public class Student {
int rollNo;
int age;
public void display1()
{
System.out.println("welcome to all of you");
}
public void display2()
{
System.out.println("Automation is very easy");
}

public static void main(String[] args) {
Student Studentobj = new Student();
Studentobj.age = 18;
Studentobj.rollNo = 5;
Studentobj.display1();
Studentobj.display2();
System.out.println("RollNo is " + Studentobj.rollNo);
System.out.println("Age is " + Studentobj.age);
	}
}
