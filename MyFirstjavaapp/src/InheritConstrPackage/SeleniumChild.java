//Child
package InheritConstrPackage;

public class SeleniumChild extends Automation {
	public SeleniumChild()
	{
	 System.out.println("child class default constructor");
	}
	public SeleniumChild(int a)
	{
	 System.out.println("child class one parameterized constructor");
	}
	public SeleniumChild(int a, int b)
	{
	 System.out.println("child class two parameterized constructor");
	}
	public SeleniumChild(int a, int b, int c)
	{
	 System.out.println("child class three parameterized constructor");
	}
	public static void main(String[] args) {
		SeleniumChild childObj = new SeleniumChild();		
	}
}
