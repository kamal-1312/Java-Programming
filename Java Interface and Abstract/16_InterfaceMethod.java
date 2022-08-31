
interface Client
{
	void webdesign();   // method is public + abstract
	void webdevelop();  // method is public + abstract
}
abstract class Kamal implements Client   // class doesnt implements webdevelop method so it is abstract
                                         // and throws error , also object cant be created ;
	/*  error: Kamal is not abstract and does not override abstract method webdevelop() in Client class Kamal implements Client */									 
										 
{
	@Override
	public void webdesign()
	{
		System.out.println("menu , dot , font , bg color,css");
	}
} 
class Raj extends Kamal                      // to use webdesign method
{
	@Override
	public void webdevelop()
	{
		System.out.println("HTML , JAVASCRIPT ");
	}
}
class main
{
	public static void main(String args[])
	{
		Raj k = new Raj();
		k.webdesign();k.webdevelop();
	}
}