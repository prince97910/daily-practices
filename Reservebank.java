//To override methods given below classses
 //    Bank [interst(0%)]
//sbinterest(7%)]     Axis[interest(8%)]    Icici[interest[(9%)]

class bank
{
	void rateofinterest()
	{
		System.out.println("Interests of many Banks");
		}
}
class sbi extends bank
{
	int rateofinterest()
	{
		System.out.println("sbi interest is 7%");
		return 7;
	}
}
class axis extends bank
{
	int rateofinterest()
	{
		System.out.println("axis interest is 8");
		return 8;
	}
}
class icici extends bank
{
	int rateofinterest()
	{
		System.out.println("icici nterest is 9%");
		return 9;
	}
}
 class Reservebank
{
	public static void main(string[] args)
	{
		icici i=new icici();
		i.rateofinterest();
	}
}