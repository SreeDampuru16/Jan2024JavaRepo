package PackageJava;

public class ConstrSolution2 {
	int a,b,c,d,e;
	public void method1(int x1,int x2,int x3,int x4,int x5) {
		 a = x1;
		 b = x2;
		 c = x3;
		 d = x4;
		 e = x5;
	}
	public static void main(String[] args) {
		ConstrSolution2 obj = new ConstrSolution2();
		obj.method1(1,2,3,4,5);
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		System.out.println(obj.e);
	}
}
