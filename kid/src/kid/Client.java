package kid;
import kid.SalesData;

public class Client 

{
	
	public static void main(String args[])
	
	{
		
	SalesData data = new SalesData();
	data.display();
	displayGreeting();
	
	}
	
	private static void displayGreeting()
	
	{
		
	System.out.println("Hello happy sales people !");
	System.out.println("This App shows SALES DATA");
	
	}

}
