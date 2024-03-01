// Creation of object of class in another class within same package
// classA a has method and in ClassB the object of ClassA is used.
package PackageJava1Obj;

public class ClassB {

	public static void main(String[] args) {
		 ClassA obj = new ClassA(); // has a relationship
		 obj.method1();
		 obj.method2();
		}
}
