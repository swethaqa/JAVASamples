package assignment;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading MO = new MethodOverloading();
		MO.add(3, 4);
		MO.add(2, 3, 5);

	}
	
	public void add(int a, int b)
	{
		int c = a + b;
		System.out.println(c);
	}

	public void add(int a, int b, int c)
	{
		int d = a + b+c;
		System.out.println(d);
	}
}
