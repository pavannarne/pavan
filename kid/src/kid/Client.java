package kid;
import kid.SalesData;

public class Client 

{
	
	public static void main(String args[])
	
	{
    
	SalesData = Repository.getSalesData(departmentId);
	
	
	}
	/**
	 * display sales data in nice format
	 * @param salesData
	 */
	private static void displaySalesData(SalesData salesData)
	
	{
		
	System.out.println("Hello happy sales people !");
	System.out.println("This App shows SALES DATA");
	
	}

}
