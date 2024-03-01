package HierarInheritPackage;

public class HeirarInheritSon2 extends HeirarInheritDemo{

	public void method1Son2()
	{
		System.out.println("Son2 method1");		
	}
	public void method2Son2()
	{
		System.out.println("Son2 method2");
	}
	public static void main(String[] args) {
		HeirarInheritSon2 Son2Obj = new HeirarInheritSon2();
		Son2Obj.method1();
		Son2Obj.method2();
		Son2Obj.method1Son2();
		Son2Obj.method2Son2();
		Son2Obj.abc =12;
		System.out.println("value of variable abc:" + Son2Obj.abc);
	}
}
