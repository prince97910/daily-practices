package fs;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.PrintStream;

public class File2
{

	public static void main(String[] args)
	{
		try
		{
			FileOutputStream f=new FileOutputStream("D:\\newfilebyjava.txt");
		String s1="my computer is upGraded with many applications . i want to create apps with java i want to join space agency";
		byte b[]=s1.getBytes();
		f.write(b);
		f.close();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}





}
