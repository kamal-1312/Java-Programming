import java.util.HashSet;
import java.util.Iterator;


class HashDemo
{
	public static void main(String[] args)
	{
		HashSet<String> set = new HashSet<String>();
		
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
		
	}
}