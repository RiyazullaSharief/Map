package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapProgram
{
	public static void main(String[] args)
	{
		Map<Integer,String> map=new HashMap<>();
		//HashMap<Integer,String> map=new HashMap<>();
		map.put(10,"Atishay");
		map.put(10,"Katappa");
		map.put(20,"Hello");
		map.put(null,"A");
		map.put(null,"B");
		System.out.println(map);
		System.out.println(map.containsKey(10));
		System.out.println(map.containsKey(20));
		System.out.println(map.containsKey(30));
		System.out.println(map.containsValue("Katappa"));
		System.out.println(map.get(10));
		System.out.println(map.isEmpty());
	}
}
