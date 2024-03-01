package PackageJava2Obj;

import PackageJava1Obj.ClassA;

public class ObjectDiffPackage1 {

	public static void main(String[] args) {
		ClassA obj = new ClassA(); // has a relationship
		obj.method1();
		obj.method2();
	}
}
