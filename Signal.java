class yellow implements red,green
{
	public void r1()
	{
		System.out.println("colour of signal is red");
	}
	
	public void g1()
	{
		System.out.print("colour of signal is green");
	}
	
	public void y1()
	{
		System.out.print("colour of signal is yellow"); 
	}
}
public class Signal
{
	public static void main (String[] args)
	{
		yellow s=new yellow();
		s.r1();
		s.g1();
		s.y1();
	}
}
