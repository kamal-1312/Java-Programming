                     /*  Super Keyword */
					 
					 
class A                 //sub class
{
	int a = 10 ;
		void show()
	{
	
		System.out.println("welcome ");
		
	}

}					 
					 
class B extends A                //super class 1
{
		int a = 20 ;
		              //super method
		void show()
	{
	
		super.show()  ;
		System.out.println("Principal of two Numbers "+ a);
			System.out.println("Principal of two Numbers "+ super.a);  //super variable
	}

}	

class Super 
{	
	 public static void main (String args[])
	{
		B r = new B();
		r.show();	
	}
}