package assignment;

public class MethodOverriding {
	
public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		a.add();
		b.add();

	}

}
	
	class A
	{
		public void add()
		{
			int a = 2, b= 4;
			int c = a+b;
			System.out.println(c);
		}
	}
	class B extends A
	{
		public void add()
		{
			int a = 5, b= 4;
			int c = a+b;
			System.out.println(c);
		}
	}
		
	
	
