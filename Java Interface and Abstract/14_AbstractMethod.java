abstract class Programming
{
	public abstract void Developer();
	public abstract void Rank();
}
  
abstract class HTML extends Programming    // if we dont make it abstract it will give this error
{

/*14_AbstractMethod.java:6: error: HTML is not abstract and does not override 
abstract method Rank() in Programming  also Rank method is not used in Html thatsy  */


		@Override    //we have to overrideclass for using abstract method
		public void Developer()
		{
			System.out.println("Tim Berners Lee");
		}
}

class Java extends Programming 	
{
		@Override    
		public void Developer()
		{
			System.out.println("James Gosling");
		}
		@Override    
		public void Rank()                         // here we initialized both the abstract method
		{
			System.out.println("3rd");
		}
}
class main
{
	public static void main(String args[])
	{
		//Programming h = new HTML();    // comment cause Html Made abstract method  
		//h.Developer();
		
		Programming j = new Java();    //we can create object for Programming in case of html or java 
		                                     // cause it is super class and have acces to thier objects 
		j.Developer();j.Rank();
		
		
	}
	
}

