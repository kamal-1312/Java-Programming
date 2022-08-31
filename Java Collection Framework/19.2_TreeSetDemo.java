import java.util.TreeSet;
import java.util.Iterator;


class TreeSetDemo
{
	public static void main(String[] args)
	{
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("Sijo");
		set.add("Maharshi");
		set.add("Kamal");
		set.add("Sagar");
		set.add("Hardik");
		set.add("Jose");
		
		System.out.println("Set==> " + set);
		System.out.println(set.hashCode());
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
		{
			String str = itr.next();
			System.out.println(str.hashCode() + "==> " + str);
		}
		
		if(set.contains("Hardik"))
		{
			System.out.println("The set contains Hardik");
		}
		/*TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(5);
		set.add(10);
		set.add(1);
		set.add(4);
		set.add(1);
		set.add(2);
		
		
		System.out.println("Set==> " + set);
		System.out.println(set.hashCode());
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext())
		{
			Object str = itr.next();
			System.out.println(str.hashCode() + "==> " + str);
			
		}*/
		
	}
}