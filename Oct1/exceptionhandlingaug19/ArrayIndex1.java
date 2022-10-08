package exceptionhandlingaug19;

public class ArrayIndex1 {

	public static void main(String[] args) {
	try {
		String[] arr = { "Ram","Ravi","Anil","Mohan"};
		
		for(int i=0;i<=6;i++)
		{
			System.out.println(arr[i]);
		}
	}
	catch(ArrayIndexOutOfBoundsException a)
	{
		System.out.println("Please ensure the loop should be less than 4");
	}

	}

}
