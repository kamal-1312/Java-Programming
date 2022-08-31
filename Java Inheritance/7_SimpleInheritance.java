                     /*  SIMPLE INHERITANCE*/
					 
					 
class Student                //sub class
{
	int roll , marks ;
	String name ;
	
	//Private members cannot be extended to the sub class but protected and public can . 
	void input()
	{
		System.out.println("Enter Details of student");
	}
	
}					 
					 
class Kamal extends Student                //super class
{
	void disp()
	{
		roll = 13 ; marks = 82 ; name = "Kamal";
		System.out.println(roll+" "+name+" "+marks );
	}
	
	public static void main (String args[])
	{
		Kamal K = new Kamal() ;
		K.input();
		K.disp();
	}
	
}					 
					 