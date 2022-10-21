//program using setting and getting method

public class Namesetting extends Thread
{
	public void run()
	{
			System.out.println("program using setting and getting method ");
	}		
	public static void main(String[] args)
	{
		Namesetting s1=new Namesetting();
		Namesetting s2=new Namesetting();
		
		System.out.println("name without setting name of s1"+s1.getName());
		System.out.println("name without setting name of s2"+s2.getName());
		s1.start();
		s2.start();	
		s1.setName("java");
		s2.setName("python");
		System.out.println("name after seting name s1"+s1.getName());
		System.out.println("name after seting name s2"+s2.getName());
		

	}
}