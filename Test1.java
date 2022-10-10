// example of nested try and catch


public class Test1
{
	public static void main(String[] args)
	{
		int x,y;
		x=0;
		y=10;
		String s1="Null";
		
		try{
			int z=y/x;
			System.out.println("x divedes y"+z);
			try{
				int i=Integer.parseInt(s1);
				System.out.println("string to integer"+i);
			}
			catch(Exception e)
			{
				System.out.println("this is excetion of number format"+e);
			}
		}
			catch(Exception e)
			{
				System.out.println("this is arithmetic error");
			}
			System.out.println("nested try and catch ");
			System.out.println("this is two type of exception 1.incorrect number format and artihmetic errror");
	}
}