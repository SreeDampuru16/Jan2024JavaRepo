/*Output should be in the below sequence using this keyword
three parameterized method
four parameterized method
default method
one parameterized method
two parameterized method
*/
package PackageJava;
public class ConstructorDemoAss2 {
	//Default Constructor
			public void method() {
				this.method4(1,2,3,4);
				System.out.println("Default Constructor..");
			}
		    //one parameterized Constructor
			public void method1(int a) {
				this.method();
				System.out.println("one parameterized Constructor..");
			}
		    //Two parameterized Constructor
			public void method2(int a, int b) {
				this.method1(1);
				System.out.println("Two parameterized Constructor..");
			}
			 //Three parameterized Constructor
			public void method3(int a, int b, int c) {
				System.out.println("Three parameterized Constructor..");
			}	
			 //Four parameterized Constructor
			public void method4(int a, int b, int c, int d) {
				this.method3(1, 2, 3);
				System.out.println("Four parameterized Constructor..");
			}	
			//Main 
			public static void main(String[] args) {
				ConstructorDemoAss2 obj = new ConstructorDemoAss2();
				obj.method2(1,2);
			}
}
