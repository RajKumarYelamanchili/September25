package exceptionhandlingaug19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class FileNotFoundEx {

	public static void main(String[] args) {
		
		try
		{
		File file = new File("D:\\abcdef.txt");
		FileReader fr = new FileReader(file);
		System.out.println("Hi");
		
		
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Please ensure the file is present in D drive");
		}
	}

}
