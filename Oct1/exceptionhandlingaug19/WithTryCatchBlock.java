package exceptionhandlingaug19;

public class WithTryCatchBlock {

	public static void main(String[] args) {
		try
		{
			int x=100;
			int y=0;
			int z=x/y;
			System.out.println("value of z: " + z);
		}
		catch(ArithmeticException e)
		{
			System.out.println("This is because of denominator is zero");
		}
System.out.println("rest of code");
	}

}
