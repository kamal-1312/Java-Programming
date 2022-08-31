                     /*  Multilevel INHERITANCE*/
					 
					 
class A                 //sub class
{
	int a ,b ,c ;
	
	
	//Private members cannot be extended to the sub class but protected and public can . 
	void add()
	{
		a=100; b =200 ; 
		c= a+b ;
		System.out.println("Sum of two Numbers = " + c);
	}
		void sub()
	{
		a=500 ;b =200 ; 
		c= a-b ;
		System.out.println("Difference of two Numbers = " + c);
	}
	
}					 
					 
class B extends A                //super class 1
{
	void multi()
	{
		a=100 ;b =200 ; 
		c= a*b ;
		System.out.println("Product of two Numbers = " + c);
	}
		void Division()
	{
		a=600 ;b =200 ; 
		c= a/b ;
		System.out.println("Diivision of two Numbers = " + c);
	}
}	
class C extends B                //super class 2
{
	void mod()
	{
		a=100 ;b =5 ; 
		c= a%b ;
		System.out.println("Modulus of two Numbers = " + c);
	}				
}
class Test
{	
	 public static void main (String args[])
	{
		C r = new C() ;
	    r.add() ; r. sub() ; r.multi() ; r.Division() ; r .mod() ;
	}
}