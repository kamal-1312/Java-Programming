import java.util.ArrayList;

class Javacollections 
{
	public static void main(String[] args)
	{
		ArrayList<String> Name = new ArrayList<String>();
         Name.add("Kamal") ;              // predefined method to in arraylist	
		 Name.add("Sagar") ;
         Name.add("Sijo") ;	
		System.out.println(Name);	
		Name.add("Raj");    //add element in last
		System.out.println(Name);
		
		Name.add(2,"Akshit");   //middle
		System.out.println(Name);
		
		Name.add(0 ,"Maharshi");  // beginning
		System.out.println(Name);
		
		//remove element
		
		Name.remove(3) ; // index number
		System.out.println(Name);
		
		//replace element
		
		Name.set(0,"Akshay"); // set is use to replace
		System.out.println(Name);
		
		// to only print the particular element
		System.out.println(Name.get(2));
		
		// to delete all the elements at once
		// Name.clear() ; 
		
	}
}