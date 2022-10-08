package exceptionhandlingaug19;

public class StringArrayIndex {
	public static void main(String args[])
	{
		try
		{
		String a="Sachin Tendulkar";
		System.out.println(a.length());
		 char c =  a.charAt(21);
		 System.out.println(c);
		
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("please give index less than 16");
		}
	}

}
