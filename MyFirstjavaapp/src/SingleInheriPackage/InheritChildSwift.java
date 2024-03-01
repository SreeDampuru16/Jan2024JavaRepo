package SingleInheriPackage;

public class InheritChildSwift extends InheritanceDemo {

	public void method3()
	{
	    System.out.println("child class method3");
	}
	public void method4()
	{
		System.out.println("child class method4");	
	}
	public static void main(String[] args) {
		InheritChildSwift childObj = new InheritChildSwift();// Child class object
		childObj.method1();//parent method
		childObj.method2();//parent method
		childObj.method3();//child method
		childObj.method4();//child method
		childObj.abc = 12;//parent variable
		System.out.println("value of abc:" + childObj.abc);
	}
}
