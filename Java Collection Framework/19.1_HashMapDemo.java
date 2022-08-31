import java.util.*;

class HashMapDemo
{
	public static void main(String[] args)
	{
		Map<String, Integer> marks = new HashMap<String, Integer>();
		marks.put("Sijo", 98);
		marks.put("Maharshi", new Integer(69));
		marks.put("Kamal", new Integer(47));
		marks.put("Hardik", new Integer(120));
		marks.put("Sagar", new Integer(12));
		
		Set<Map.Entry<String, Integer>> st = marks.entrySet();
		
		for(Map.Entry<String, Integer> item : st)
		{
			System.out.println(item.getKey() + "==> " + item.getValue());
		}
		
		System.out.println(marks.get("Sijo"));     // .get() is used to fetch the value of the particular key
		
		
	}
}
