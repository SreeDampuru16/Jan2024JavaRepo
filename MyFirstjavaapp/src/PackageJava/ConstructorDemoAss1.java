/*Output should be in the below sequence using this keyword
three parameterized constructor
default constructor
one parameterized constructor
two parameterized constructor 
four parameterized constructor
*/
package PackageJava;
public class ConstructorDemoAss1 {
		//Default Constructor
		public void ConstructorDemoAss1() {
			this.ConstructorDemoAss1(1,2,3);
			System.out.println("Default Constructor..");
		}
	    //one parameterized Constructor
		public void ConstructorDemoAss1(int a) {
			this.ConstructorDemoAss1();
			System.out.println("one parameterized Constructor..");
		}
	    //Two parameterized Constructor
		public void ConstructorDemoAss1(int a, int b) {
			this.ConstructorDemoAss1(1);
			System.out.println("Two parameterized Constructor..");
		}
		 //Three parameterized Constructor
		public void ConstructorDemoAss1(int a, int b, int c) {
			System.out.println("Three parameterized Constructor..");
		}	
		 //Four parameterized Constructor
		public void ConstructorDemoAss1(int a, int b, int c, int d) {
			this.ConstructorDemoAss1(1,2);
			System.out.println("Four parameterized Constructor..");
		}	
		//Main 
		public static void main(String[] args) {
			ConstructorDemoAss1 constrObj =	new ConstructorDemoAss1();
			constrObj.ConstructorDemoAss1(1,2,3,4);
		}
	}
