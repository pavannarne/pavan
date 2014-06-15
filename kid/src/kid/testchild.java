package kid;

/**
 * testchild is class to call the child class
 * @author PavaN
 *
 */
public class testchild 

{
	public static void main(String args[])
	{
		/**
		 * c is a newly created object for the child class
		 * to call the child class methods 
		 */
		child c=new child();
		c.test();
		c.test(25);

		/**
		 * check the student is young
		 */
		if(c.isYoung())
		
		{
			/**
			 * c is true displays the string
			 */
			System.out.println("child is just young");
		}
		
		else
		
		{
			/**
			 * c is false displays the string
			 */
			System.out.println("child lost his youthful ");
		}
		
		
	}

}
