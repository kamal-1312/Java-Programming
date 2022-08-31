class A
{
	static int b = 20 ; //Static
	int c = 30 ; //instance
	public static void main(String[] args)
	
	{
		int a = 10 ; //Local
		System.out.println(a);
		System.out.println(A.b);
		A ref = new A();
		System.out.println(ref.c);
	}
	
}