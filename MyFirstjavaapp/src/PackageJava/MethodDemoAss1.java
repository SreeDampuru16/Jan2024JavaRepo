//Method Example :((((10+2)+2)-2)*2)/2)
package PackageJava;
public class MethodDemoAss1 {
	public int sum(int a, int b)
	{
		int sumResult = a+b;
		return sumResult;
	}
	public int subtract(int a, int b)
	{
		int subtractResult = a-b;
		return subtractResult;
	}
	public int mul(int a, int b)
	{
		int mulResult = a*b;
		return mulResult;
	}
	public int division(int a, int b)
	{
		int divisionResult = a/b;
		return divisionResult;
	}
	//Main method
	public static void main(String[] args) {

		MethodDemoAss1 aoObj = new MethodDemoAss1();
		int sumResult = aoObj.sum(10,2);
		System.out.println("Sum Result is " + sumResult );
		int sumResult1 = aoObj.sum(sumResult,2);
		System.out.println("Sum1 Result is " + sumResult1 );
		int subResult = aoObj.subtract(sumResult1,2);
		System.out.println("subtract Result is " + subResult );		
		int mulResult = aoObj.mul(subResult,2);
		System.out.println("mult Result is " + mulResult );
		int divResult = aoObj.division(mulResult,2);
		System.out.println("Final Expression for "
				+ "((((10+2)+2)-2)*2)/2) is  " + divResult);
	}

}

