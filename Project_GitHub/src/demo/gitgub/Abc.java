package demo.gitgub;

public class Abc {
 
	public void m1()
	{
		System.out.println("M1 Method");
	}
	public void m2()
	{
		System.out.println("m2 method");
	}
	public static void main(String[] args) {
		System.out.println("GitHub Demo project");
		Abc a= new Abc();
		System.out.println("Start");
		a.m1();
		a.m2();
		System.out.println("End");
	}
}
