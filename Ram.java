public class Ram extends Thread
{
	public void run()
	{
		System.out.println("this is example of program of sleep, join in threading");
	}
	public static void main(String[] args)
	{
		Ram t1=new Ram();
		Ram t2=new Ram();
		t1.start();
		
			try
			{
				for(int i=0;i<5;i++)
					
				{
					System.out.println("value of number is" +i);
					Thread.sleep(2000);
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		t2.start();
			try
			{
				t2.join();
				
				System.out.print("yoo bro");
			}
			catch(Exception a)
			{
				System.out.println(a);
			}
	}
}