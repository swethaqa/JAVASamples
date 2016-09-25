package assignment;

public class ExceptionHandling {
	

	public static void main(String[] args) {
		try{
			int a = 4 , b = 0;
			int c = a/b;
			System.out.println(c);
			} 
			catch(ArithmeticException e)
			{
				System.out.println("The given values are in valid please check");
			}
			finally
			{
				System.out.println("I am in finally block");
			}
		
		

}
	
}