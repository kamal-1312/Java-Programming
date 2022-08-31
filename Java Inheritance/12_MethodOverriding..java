                     /*  METHOD OVERRIDING */
					 
					 
class A                 //sub class
{
	//Private members cannot be extended to the sub class but protected and public can . 
	void show()
	{
	
		System.out.println("Sum of two Numbers ");
	}

}					 
					 
class B extends A                //super class 1
{
	@Override                                      //Overriding
	void show()
	{
	    super.show();                             // super keyword 
 		System.out.println("Principal of two Numbers ");
	}

}					

class Test
{	
	 public static void main (String args[])
	{
		A r = new B();
		r.show();
	}
}