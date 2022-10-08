package exceptionhandlingaug19;

public class NullPointerEx {

	public static void main(String[] args) {
		
		try
		{
		String a= null;
		System.out.println(a.charAt(0));
		}
		catch(NullPointerException e)
		{
			System.out.println("since it is null, you will not get anything at 0th position");
		}
	}

}
