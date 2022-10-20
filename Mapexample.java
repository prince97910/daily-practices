package fs;
import java.util.HashMap;
import java.util.Map;

public class Mapexample {

	public static  void main(String[] args)
	{
		HashMap <Integer,String> hs=new HashMap<Integer,String>();
		hs.put(1,"sai");
		hs.put(2,"ramesh");
		hs.put(3,"anup");
		hs.put(4,"berlin");
		hs.put(5,"perofessor");
		for(Map.Entry M:hs.entrySet() )
		{
			System.out.println(M.getKey()+" "+M.getValue());
		}
		
	}

}
