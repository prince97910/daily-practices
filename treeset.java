package prince;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class hashsetdemo
{
	public static void main(String[] args)
	{
	Set<String> hs=new TreeSet<String>();
	hs.add("raja");
	hs.add("raj");
	hs.add("queen");
	hs.add("minister");
	Iterator<String> it=hs.iterator();
	while(it.hasNext())
	{
		System.out.println("implementation of hashset "+it.next());
	}
	

}

}
