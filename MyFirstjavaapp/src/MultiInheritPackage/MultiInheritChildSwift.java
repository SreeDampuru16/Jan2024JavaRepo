package MultiInheritPackage;

public class MultiInheritChildSwift extends MultiInheritFatherSwift {

	public void childMethod1()
	{
	    System.out.println("child class method1");
	}
	public void childMethod2()
	{
		System.out.println("child class method2");	
	}
	public static void main(String[] args) {
		MultiInheritChildSwift multiChildObj = new MultiInheritChildSwift();// Child class object
		multiChildObj.gfmethod1();//grand father method
		multiChildObj.gfmethod2();//grand father method
		multiChildObj.fmethod3();//father method
		multiChildObj.fmethod4();//father method
		multiChildObj.childMethod1();//child method
		multiChildObj.childMethod2();//child method
		multiChildObj.abc = 12;//grand father variable
		System.out.println("value of abc:" + multiChildObj.abc);
	}

}
