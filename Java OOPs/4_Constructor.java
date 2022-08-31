class Constructor
{
  /*int z ; 
  String name1 ;
  
 Constructor()
  {
	  z=50;
	  name1 = "Kamal";
	  System.out.print(z+" "+name1);
  }
  
  /*
		Default Constuctor
  
   Constructor()
  {
	  a=0;
	  name = null;
  }
  
  */
  int x ;String y ;
  
  Constructor( int a ,String name )   //paramyterized constructor
  {
	 	 x=a;
	   y=name ;
	  
  }
  void show()
  {
	  
	  System.out.println(x+" "+y);
  }
}
class Demo
{
	public static void main(String[] args)
	{
		Constructor ref = new Constructor(21 , "Sagar");
		ref.show();
		
		
	}
}