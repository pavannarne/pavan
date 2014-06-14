package kid;

public class client1 

{
	public static void main(String args[])
	{
		child c=new child();
		c.test();
		c.test(25);

		if(c.isYoung())
		
		{
			System.out.println("child is just young");
		}
		
		else
		
		{
			System.out.println("child lost his youthful ");
		}
		
		
	}

}
