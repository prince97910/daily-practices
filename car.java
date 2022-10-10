//)Abstract class using Hirerchial inhertiance
abstract vehicle
{
	abstract void model()
	
}
class Mahindra extends vehicle
{
	void model()
	{
		System.out.println("this is mahindra thar");
	}
}
class Honda extends vehicle
{
	void model()
	{
		System.out.println("this is honda city");
	}
}
public class car
{
	public static  void main(String[] args)
	{
		vehicle v=new Mahindra();
		vehicle v1=new Honda();
//Mahindra m=new Mahindra();
//Honda h=new Honda();
		System.out.println("Top brands and top cars");
		v.model();
		v1.model();
		
	}
}