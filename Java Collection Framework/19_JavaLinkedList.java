import java.util.LinkedList;

class Javacollections 
{
	public static void main(String[] args)
	{
		//here unlikely array elements are added in form of doubly list
		
		LinkedList<String> Name = new LinkedList<String>();
         Name.add("Kamal") ;              // predefined method to in arraylist	
		 Name.add("Sagar") ;
         Name.add("Sijo") ;	
		System.out.println(Name);	
		
		//alsoo
		Name.addLast("Raj");    //add element in last
		System.out.println(Name);
		
		Name.add(2,"Akshit");   //middle
		System.out.println(Name);
		
		Name.addFirst("Maharshi");  // beginning
		System.out.println(Name);
		
		//remove element
		
		//Name.removeFirst();
		//Name.removeLast();
		
		Name.remove(3) ; // index number
		System.out.println(Name);
		

		
		// to delete all the elements at once
		// Name.clear() ; 
		
		
		//for each if u are working with sets ... 
		
		for(String str:Name)
		{
			System.out.println(str) ; 
		}
		
	}
}