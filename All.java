//one class with Constructor,Named Method,Anonymous,Static method
import java.util.Scanner;

class All
{
	int c,x,y;
	All()
	{
		System.out.println("constructor is present in program");
	}
	
	void method(int x , int y)
	{
		c=x+y;
		System.out.println("named method "+c);
	}
	
	static void display()
	{
		System.out.println("this is static method");
	}
	 
	public static void main(String[] args)
	{
		All a=new All();
		
		a.method(7,7);
		display();
	}
}