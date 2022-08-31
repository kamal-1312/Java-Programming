                     /*  Hierarchical INHERITANC	E*/
					 
					 
class A                 //sub class
{
	//Private members cannot be extended to the sub class but protected and public can . 
	void input()
	{
	
		System.out.println("Sum of two Numbers ");
	}

}					 
					 
class B extends A                //super class 1
{
		void show()
	{
	
		System.out.println("Principal of two Numbers ");
	}

}	
class C extends A                //super class 1
{
	void disp()
	{
	
		System.out.println("MARSHAL of two Numbers ");
	}
				
}
class Test
{	
	 public static void main (String args[])
	{
		B r = new B();
		C r2 = new C();
		r.input();r.show();
		r2.input() ;r2.disp();
	}
}