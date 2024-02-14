// For one Object--- 5 calls for assigning values
// For printing values--- 5 calls for printing values
// Single Object--- 5+ 5 =10 both assigning and printing
// 10 Object--- 10*10 calls 
package PackageJava;
public class ConstrSolution3 {

	int a,b,c,d,e;
	public  ConstrSolution3(int x1,int x2,int x3,int x4,int x5) {
		 a = x1;
		 b = x2;
		 c = x3;
		 d = x4;
		 e = x5;
	}
	public static void main(String[] args) {
		ConstrSolution3 obj = new ConstrSolution3(1,2,3,4,5);
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		System.out.println(obj.e);
	}

}
