package HashMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapProgram
{
	public static void main(String[] args)
	{
		Map<Integer,String> map=new TreeMap<>();
		//TreeMap<Integer,String> map=new TreeMap<>();
		map.put(30,"Hi");
		map.put(20,"Hello");
		map.put(10,"How are you");
		System.out.println(map);
		Set<Map.Entry<Integer,String>> entries=map.entrySet();
		for(Map.Entry<Integer,String> entry:entries)
		{
			Integer key=entry.getKey();
			String value=entry.getValue();
			System.out.println("Key: "+key+" Value: "+value);
		}
	}
}
