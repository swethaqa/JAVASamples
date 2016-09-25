package assignment;

public class UsingAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass AC = new operations();
		
		AC.add();
		AC.sub();
	
	}

}

class operations extends AbstractClass
{
	@Override
	void add() {
		int a = 3 , b = 4;
		System.out.println(a+b);
	}

	@Override
	void sub() {
		int a = 6 , b = 4;
		System.out.println(a-b);
	}
	
}


