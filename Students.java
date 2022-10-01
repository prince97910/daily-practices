//students class witj sno,sname,smark data members and  use 2 methods input() to input and output() as dispaly?


import java.util.Scanner;
class Students
{
	int sno;
	String sname;
	int smark;
	void input(int x, String y, int z)
	{
		
		sno=x;
		sname=y;
		smark=z;
	}	
	
	
	void output(Students[] students)
	{	
			
			for(Students s:students)
			{
					System.out.println("Student Details\n=================");
					System.out.println("Sno:"+s.sno);
					System.out.println("Name: "+s.sname);
					System.out.println("smark: "+s.smark);
			}
	}
	public static void main(String[] args)
	{
		Students s1=new Students();
		s1.input(1,"peter",95);
		
		Students s2=new Students();
		s2.input(2,"kumar",98);
	
		Students s3=new Students();
		s3.input(3,"magesh",96);
		
		Students[] slist = new Students[]{s1,s2,s3};
		
		//s1.output(slist);
		
		s3.output(slist);
		
	
	}
}