//Method Example :((((10/2)-2)+2)-2)/2)
package PackageJava;
public class MethodDemoAss2 {
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
	public static void main(String[] args) {
		MethodDemoAss2 aoObj = new MethodDemoAss2();
		int divResult = aoObj.division(10,2);
		System.out.println("Div Result is " + divResult );
		int subResult = aoObj.subtract(divResult,2);
		System.out.println("Subtract Result is " + subResult );
		int sumResult = aoObj.sum(subResult,2);	
		System.out.println("summation Result is " + sumResult );
		int subResult1 = aoObj.subtract(sumResult,2);
		System.out.println("subtract1 Result is " + subResult1 );
		int finalResult = aoObj.division(subResult1,2);
		System.out.println("Expression result for "
				+ "((((10/2)-2)+2)-2)/2) is  " + finalResult);
	}
}

