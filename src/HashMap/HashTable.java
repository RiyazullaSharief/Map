package HashMap;

import java.util.Hashtable;
import java.util.Map;

public class HashTable
{
	public static void main(String[] args)
	{
		Map<Integer,String> map=new Hashtable<>();
		//Hashtable<Integer,String> map=new Hashtable<>();
		map.put(10,"Atishay");
		map.put(10,"Katappa");
		map.put(20,"Hello");
		//map.put(null,"A");
		//map.put(null,"B");
		System.out.println(map);

	}
}
