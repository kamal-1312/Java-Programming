class Constructor
{
  
  int x ;String y ;
  
  Constructor()  
  {
	 	 x=20;
	   y="kamal" ;
	    System.out.println(x+" "+y);
	  
  }
  Constructor(Constructor ref)    //copyconstructor
  {
	  x = ref.x;
	  y = ref.y;	
		 System.out.println(x+" "+y);
  }

}
class Demo
{
	public static void main(String[] args)
	{
		Constructor r = new Constructor();
		Constructor r2 = new Constructor(r);  // copying values of r to new object      
                                               //and passing as reference to copy data
		
	}
}