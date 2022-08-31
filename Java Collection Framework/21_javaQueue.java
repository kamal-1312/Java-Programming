import java.util.ArrayDeque;

class Javacollections 
{
	public static void main(String[] args)
	{
		ArrayDeque<String> Name = new ArrayDeque<>();  //fifo
		
		Name.push("Kamal");
		Name.push("Sagar");
		Name.push("Sijo");
		
		System.out.println(Name);
		
		Name.pop();  
		System.out.println(Name);
		
	}
	
}	