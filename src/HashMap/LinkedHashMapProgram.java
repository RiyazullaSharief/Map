package HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMapProgram
{
	public static void main(String[] args)
	{
		Map<Integer,String> map=new LinkedHashMap<>();
		//LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
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
