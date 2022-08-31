                       /* Abstract class example */
abstract class Animal
{
	Animal()
	{
		System.out.println("ALL animal sounds.....");
		
	}
	public abstract void sound();
}
class Dog extends Animal
{
	Dog()
	{
		super() ;                         //this will call the constuctor of the base class that is Animal 
	}
	public void sound()
	{
		System.out.println("Dog barks");
	}
}
class Lion extends Animal
{
	public void sound()
	{
		System.out.println("lion Roars");
	}
}
class AbstractC
{
		public static void main(String args[])
		{
			Dog d = new Dog();
			Lion l = new Lion();
			d.sound() ;
			l.sound() ;
		}
}