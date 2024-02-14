/*1.Constructor is like method.
  2.Constructor name and class name will be same.
  3.no return type
  4.no need to call the constructor, it will be called 
   automatically as we create the object of the class.
*/
package PackageJava;
public class ConstrDemo {
	//Default Constructor
	public ConstrDemo() {
		System.out.println("Default Constructor..");
	}
    //one parameterized Constructor
	public ConstrDemo(int a) {
		System.out.println("one parameterized Constructor..");
	}
    //Two parameterized Constructor
	public ConstrDemo(int a, int b) {
		System.out.println("Two parameterized Constructor..");
	}	
	//Main 
	public static void main(String[] args) {
		ConstrDemo constrObj =	new ConstrDemo();//Default Constructor
		ConstrDemo constrObj1 =	new ConstrDemo(1);//one parameterized Constructor
		ConstrDemo constrObj2 =	new ConstrDemo(1,2);//Two parameterized Constructor
	}

}
