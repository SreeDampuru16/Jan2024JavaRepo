package HierarInheritPackage;

public class HeirarInheritSon1 extends HeirarInheritDemo{
	public void method1Son1()
	{
		System.out.println("Son1 method1");		
	}
	public void method2Son1()
	{
		System.out.println("Son1 method2");
	}
	public static void main(String[] args) {
		HeirarInheritSon1 Son1Obj = new HeirarInheritSon1();
		Son1Obj.method1();
		Son1Obj.method2();
		Son1Obj.method1Son1();
		Son1Obj.method2Son1();
		Son1Obj.abc =12;
		System.out.println("value of variable abc:" + Son1Obj.abc);
	}

}
