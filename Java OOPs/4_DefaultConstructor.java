class Constructor
{
  int a ; 
  String name ;
  
  Constructor()
  {
	  a=50;
	  name = "Kamal";
  }
  
  /*
		Default Constuctor
  
   Constructor()
  {
	  a=0;
	  name = null;
  }
  
  */
  void show()
  {
	  System.out.print(a+" "+name);
  }
}
class Default
{
	public static void main(String[] args)
	{
		Constructor r = new Constructor();
		r.show();
		
	}
}