
import java.util.Scanner;

interface Client
{
	void input();   // method is public + abstract
	void output();  // method is public + abstract
}
class Kamal implements Client
{
	String name;
	double sal;
	public void input()
	{
		Scanner r=new Scanner(System.in);
		System.out.println("Enter Username : ");
		name = r.nextLine();
		
		System.out.println("Enter Salary : ");
		sal = r.nextDouble();
		
	}
	public void output()
	{
			System.out.println(name+" "+sal);
	}
	public static void main(String args[])
	{
		Client c = new Kamal();
		c.input();
		c.output();
	}
} 